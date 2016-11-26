package com.cpacm.moemusic.core.bean;

import java.util.List;

/**
 * Created by DIY on 2016/11/26.
 * @desciption: wiki实体
 */

public class WikiBean {

    /**
     * wiki_id : 9797
     * wiki_title : &lt;空の記憶&gt;茶太
     * wiki_title_encode : kongnojiyichatai
     * wiki_name : 9797
     * wiki_type : music
     * wiki_parent : 0
     * wiki_date : 1209139200
     * wiki_modified : 1334163346
     * wiki_modified_user : 8889
     * wiki_meta : null
     * fav_count : 2
     * wiki_fm_url : http://moe.fm/music/9797
     * wiki_url : http://moe.fm/music/9797
     * wiki_cover : {"small":"http://moefou.90g.org/wiki_cover/000/00/97/000009797_96.jpg?v=1334163367","medium":"http://moefou.90g.org/wiki_cover/000/00/97/000009797_144.jpg?v=1334163367","square":"http://moefou.90g.org/wiki_cover/000/00/97/000009797_192.jpg?v=1334163367","large":"http://moefou.90g.org/wiki_cover/000/00/97/000009797.jpg?v=1334163367"}
     * wiki_user_fav : null
     * wiki_fav : [{"fav_id":162985,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":3971648,"fav_date":1468481433,"fav_type":1},{"fav_id":162980,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":54362,"fav_date":1468401778,"fav_type":1},{"fav_id":94270,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":22513,"fav_date":1368261994,"fav_type":1},{"fav_id":83057,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":5636,"fav_date":1359600863,"fav_type":1},{"fav_id":81400,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":7538,"fav_date":1358433033,"fav_type":1},{"fav_id":76030,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":20502,"fav_date":1355476229,"fav_type":1},{"fav_id":62910,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":5960,"fav_date":1348419286,"fav_type":1},{"fav_id":28169,"fav_obj_id":9797,"fav_obj_type":"music","fav_uid":8889,"fav_date":1334164776,"fav_type":1}]
     * wiki_fav_count : 8
     */

    private long wiki_id;
    private String wiki_title;
    private String wiki_title_encode;
    private String wiki_name;
    private String wiki_type;
    private long wiki_parent;
    private long wiki_date;
    private long wiki_modified;
    private long wiki_modified_user;
    private List<MetaBean> wiki_meta;
    private CoverBean wiki_cover;
    private String fav_count;
    private String wiki_fm_url;
    private String wiki_url;
    private FavBean wiki_user_fav;
    private int wiki_fav_count;
    private List<FavBean> wiki_fav;

    public String getFav_count() {
        return fav_count;
    }

    public void setFav_count(String fav_count) {
        this.fav_count = fav_count;
    }

    public CoverBean getWiki_cover() {
        return wiki_cover;
    }

    public void setWiki_cover(CoverBean wiki_cover) {
        this.wiki_cover = wiki_cover;
    }

    public long getWiki_date() {
        return wiki_date;
    }

    public void setWiki_date(long wiki_date) {
        this.wiki_date = wiki_date;
    }

    public List<FavBean> getWiki_fav() {
        return wiki_fav;
    }

    public void setWiki_fav(List<FavBean> wiki_fav) {
        this.wiki_fav = wiki_fav;
    }

    public int getWiki_fav_count() {
        return wiki_fav_count;
    }

    public void setWiki_fav_count(int wiki_fav_count) {
        this.wiki_fav_count = wiki_fav_count;
    }

    public String getWiki_fm_url() {
        return wiki_fm_url;
    }

    public void setWiki_fm_url(String wiki_fm_url) {
        this.wiki_fm_url = wiki_fm_url;
    }

    public long getWiki_id() {
        return wiki_id;
    }

    public void setWiki_id(long wiki_id) {
        this.wiki_id = wiki_id;
    }

    public List<MetaBean> getWiki_meta() {
        return wiki_meta;
    }

    public void setWiki_meta(List<MetaBean> wiki_meta) {
        this.wiki_meta = wiki_meta;
    }

    public long getWiki_modified() {
        return wiki_modified;
    }

    public void setWiki_modified(long wiki_modified) {
        this.wiki_modified = wiki_modified;
    }

    public long getWiki_modified_user() {
        return wiki_modified_user;
    }

    public void setWiki_modified_user(long wiki_modified_user) {
        this.wiki_modified_user = wiki_modified_user;
    }

    public String getWiki_name() {
        return wiki_name;
    }

    public void setWiki_name(String wiki_name) {
        this.wiki_name = wiki_name;
    }

    public long getWiki_parent() {
        return wiki_parent;
    }

    public void setWiki_parent(long wiki_parent) {
        this.wiki_parent = wiki_parent;
    }

    public String getWiki_title() {
        return wiki_title;
    }

    public void setWiki_title(String wiki_title) {
        this.wiki_title = wiki_title;
    }

    public String getWiki_title_encode() {
        return wiki_title_encode;
    }

    public void setWiki_title_encode(String wiki_title_encode) {
        this.wiki_title_encode = wiki_title_encode;
    }

    public String getWiki_type() {
        return wiki_type;
    }

    public void setWiki_type(String wiki_type) {
        this.wiki_type = wiki_type;
    }

    public String getWiki_url() {
        return wiki_url;
    }

    public void setWiki_url(String wiki_url) {
        this.wiki_url = wiki_url;
    }

    public FavBean getWiki_user_fav() {
        return wiki_user_fav;
    }

    public void setWiki_user_fav(FavBean wiki_user_fav) {
        this.wiki_user_fav = wiki_user_fav;
    }
}
