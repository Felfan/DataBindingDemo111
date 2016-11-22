package com.fqf.databindingdemo.bean;

import android.util.ArrayMap;

import com.fqf.databindingdemo.net.BaseRetorfit;
import com.fqf.databindingdemo.net.api.WeatherInfoInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by 房庆丰 on 2016/11/1.
 */

public class WeatherInfo {

    /**
     * error : 0
     * status : success
     * date : 2016-11-01
     * results : [{"currentCity":"杭州","pm25":"24","index":[{"title":"穿衣","zs":"较冷","tipt":"穿衣指数","des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车","zs":"较不宜","tipt":"洗车指数","des":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},{"title":"旅游","zs":"适宜","tipt":"旅游指数","des":"天气较好，风稍大，但温度适宜，总体来说还是好天气。这样的天气适宜旅游，您可以尽情享受大自然的风光。"},{"title":"感冒","zs":"易发","tipt":"感冒指数","des":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"title":"运动","zs":"较不宜","tipt":"运动指数","des":"阴天，且天气寒冷，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动并注意保暖。"},{"title":"紫外线强度","zs":"最弱","tipt":"紫外线强度指数","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}],"weather_data":[{"date":"周二 11月01日 (实时：13℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/yin.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"阴转多云","wind":"北风4-5级","temperature":"16 ~ 8℃"},{"date":"周三","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"多云转晴","wind":"东北风3-4级","temperature":"16 ~ 9℃"},{"date":"周四","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"多云转晴","wind":"东风3-4级","temperature":"17 ~ 11℃"},{"date":"周五","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"东风微风","temperature":"21 ~ 12℃"}]}]
     */

    private int error;
    private String status;
    private String date;
    /**
     * currentCity : 杭州
     * pm25 : 24
     * index : [{"title":"穿衣","zs":"较冷","tipt":"穿衣指数","des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车","zs":"较不宜","tipt":"洗车指数","des":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},{"title":"旅游","zs":"适宜","tipt":"旅游指数","des":"天气较好，风稍大，但温度适宜，总体来说还是好天气。这样的天气适宜旅游，您可以尽情享受大自然的风光。"},{"title":"感冒","zs":"易发","tipt":"感冒指数","des":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"title":"运动","zs":"较不宜","tipt":"运动指数","des":"阴天，且天气寒冷，推荐您在室内进行低强度运动；若坚持户外运动，请选择合适的运动并注意保暖。"},{"title":"紫外线强度","zs":"最弱","tipt":"紫外线强度指数","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}]
     * weather_data : [{"date":"周二 11月01日 (实时：13℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/yin.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"阴转多云","wind":"北风4-5级","temperature":"16 ~ 8℃"},{"date":"周三","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"多云转晴","wind":"东北风3-4级","temperature":"16 ~ 9℃"},{"date":"周四","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"多云转晴","wind":"东风3-4级","temperature":"17 ~ 11℃"},{"date":"周五","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"东风微风","temperature":"21 ~ 12℃"}]
     */

    private List<ResultsBean> results;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static void load(ArrayMap<String, String> params, Callback callback) {
        WeatherInfoInterface callApi = BaseRetorfit.getmRetrofit().create(WeatherInfoInterface.class);
        Call<WeatherInfo> cal = callApi.getWeatherInfo(params);
        cal.enqueue(callback);
    }

    public static class ResultsBean {
        private String currentCity;
        private String pm25;
        /**
         * title : 穿衣
         * zs : 较冷
         * tipt : 穿衣指数
         * des : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
         */

        private List<IndexBean> index;
        /**
         * date : 周二 11月01日 (实时：13℃)
         * dayPictureUrl : http://api.map.baidu.com/images/weather/day/yin.png
         * nightPictureUrl : http://api.map.baidu.com/images/weather/night/duoyun.png
         * weather : 阴转多云
         * wind : 北风4-5级
         * temperature : 16 ~ 8℃
         */

        private List<WeatherDataBean> weather_data;

        public String getCurrentCity() {
            return currentCity;
        }

        public void setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public List<WeatherDataBean> getWeather_data() {
            return weather_data;
        }

        public void setWeather_data(List<WeatherDataBean> weather_data) {
            this.weather_data = weather_data;
        }

        public static class IndexBean {
            private String title;
            private String zs;
            private String tipt;
            private String des;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getZs() {
                return zs;
            }

            public void setZs(String zs) {
                this.zs = zs;
            }

            public String getTipt() {
                return tipt;
            }

            public void setTipt(String tipt) {
                this.tipt = tipt;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }
        }

        public static class WeatherDataBean {
            private String date;
            private String dayPictureUrl;
            private String nightPictureUrl;
            private String weather;
            private String wind;
            private String temperature;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayPictureUrl() {
                return dayPictureUrl;
            }

            public void setDayPictureUrl(String dayPictureUrl) {
                this.dayPictureUrl = dayPictureUrl;
            }

            public String getNightPictureUrl() {
                return nightPictureUrl;
            }

            public void setNightPictureUrl(String nightPictureUrl) {
                this.nightPictureUrl = nightPictureUrl;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }
        }
    }
}
