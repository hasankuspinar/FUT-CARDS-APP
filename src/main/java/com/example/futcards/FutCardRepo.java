package com.example.futcards;

import android.os.Handler;
import android.os.Message;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class FutCardRepo
{
    public void getAllPlayers(ExecutorService srv, Handler handler){
        srv.execute(()-> {
            try {
                List <Player> data = new ArrayList<Player>();
            URL url = new URL("http://localhost:8080/futcards/players");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder buffer = new StringBuilder();
            String line = "";
            while ((line = reader.readLine()) != null){
                buffer.append(line);
            }
            JSONArray playerArr =new JSONArray(buffer.toString());
            for (int i = 0; i < playerArr.length(); i++){
                JSONObject current = playerArr.getJSONObject(i);
                Player player = new Player(current.getString("id"), current.getString("team"),
                        current.getString("name"), current.getString("nat"), current.getString("pos"),
                        current.getInt("ovr"), current.getInt("pac"), current.getInt("shoot"),
                        current.getInt("pass"),current.getInt("dri"), current.getInt("def"), current.getInt("phy"));
                data.add(player);
            }
            Message msg = new Message();
            msg.obj = data;
            handler.sendMessage(msg);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void getAllTeams(ExecutorService srv, Handler handler){
        srv.execute(()-> {
            try {
                List <Team> data = new ArrayList<Team>();
                URL url = new URL("http://localhost:8080/futcards/teams");
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine()) != null){
                    buffer.append(line);
                }
                JSONArray teamArr =new JSONArray(buffer.toString());
                for (int i = 0; i < teamArr.length(); i++){
                    JSONObject current = teamArr.getJSONObject(i);
                    Team team = new Team(current.getString("id"), current.getString("name"),
                            current.getString("leagueName"));
                    data.add(team);
                }
                Message msg = new Message();
                msg.obj = data;
                handler.sendMessage(msg);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void getAllLeagues(ExecutorService srv, Handler handler){
        srv.execute(()-> {
            try {
                List <League> data = new ArrayList<League>();
                URL url = new URL("http://localhost:8080/futcards/leagues");
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine()) != null){
                    buffer.append(line);
                }
                JSONArray teamArr =new JSONArray(buffer.toString());
                for (int i = 0; i < teamArr.length(); i++){
                    JSONObject current = teamArr.getJSONObject(i);
                    League league = new League(current.getString("id"), current.getString("name"));
                    data.add(league);
                }
                Message msg = new Message();
                msg.obj = data;
                handler.sendMessage(msg);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void searchPlayerByName(ExecutorService srv, Handler handler, String name){
        srv.execute(()-> {
            try {
                URL url = new URL("http://localhost:8080/futcards/players/search");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                JSONObject outputData = new JSONObject();
                outputData.put("name", name);
                BufferedOutputStream writer = new BufferedOutputStream(conn.getOutputStream());
                writer.write(outputData.toString().getBytes(StandardCharsets.UTF_8));
                writer.flush();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine())!= null){
                    buffer.append(line);
                }
                JSONObject current= new JSONObject(buffer.toString());
                Player player = new Player(current.getString("id"), current.getString("team"),
                        current.getString("name"), current.getString("nat"), current.getString("pos"),
                        current.getInt("ovr"), current.getInt("pac"), current.getInt("shoot"),
                        current.getInt("pass"),current.getInt("dri"), current.getInt("def"), current.getInt("phy"));
                Message msg = new Message();
                msg.obj = player;
                handler.sendMessage(msg);
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void searchTeamByName(ExecutorService srv, Handler handler, String name){
        srv.execute(()-> {
            try {
                List <Player> data = new ArrayList<Player>();
                URL url = new URL("http://localhost:8080/futcards/teams/search");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                JSONObject outputData = new JSONObject();
                outputData.put("name", name);
                BufferedOutputStream writer = new BufferedOutputStream(conn.getOutputStream());
                writer.write(outputData.toString().getBytes(StandardCharsets.UTF_8));
                writer.flush();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine())!= null){
                    buffer.append(line);
                }
                JSONArray playerArr =new JSONArray(buffer.toString());
                for (int i = 0; i < playerArr.length(); i++){
                    JSONObject current = playerArr.getJSONObject(i);
                    Player player = new Player(current.getString("id"), current.getString("team"),
                            current.getString("name"), current.getString("nat"), current.getString("pos"),
                            current.getInt("ovr"), current.getInt("pac"), current.getInt("shoot"),
                            current.getInt("pass"),current.getInt("dri"), current.getInt("def"), current.getInt("phy"));
                    data.add(player);
                }
                Message msg = new Message();
                msg.obj = data;
                handler.sendMessage(msg);
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void searchLeagueByName(ExecutorService srv, Handler handler, String name){
        srv.execute(()-> {
            try {
                List <Team> data = new ArrayList<Team>();
                URL url = new URL("http://localhost:8080/futcards/leagues/search");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                JSONObject outputData = new JSONObject();
                outputData.put("name", name);
                BufferedOutputStream writer = new BufferedOutputStream(conn.getOutputStream());
                writer.write(outputData.toString().getBytes(StandardCharsets.UTF_8));
                writer.flush();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine())!= null){
                    buffer.append(line);
                }
                JSONArray teamArr =new JSONArray(buffer.toString());
                for (int i = 0; i < teamArr.length(); i++){
                    JSONObject current = teamArr.getJSONObject(i);
                    Team team = new Team(current.getString("id"), current.getString("name"),
                            current.getString("leagueName"));
                    data.add(team);
                }
                Message msg = new Message();
                msg.obj = data;
                handler.sendMessage(msg);
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
