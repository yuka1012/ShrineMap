package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.data.validation.Constraints.Email;

/**
 * 会員情報を保持するエンティティクラス.
 * @author matsumotoyuka
 *
 */
@Entity
public class User extends Model{

	/* 主キー*/
	@Id
	private Long id;
	
	/* ユーザ名*/
	@NotNull
	@Column(unique=true)
	private String userNm;
	
	/* メールアドレス*/
	@NotNull
	@Email
	private String email;
	
	/* パスワード*/
	@NotNull
	private String password;
	
	/* 登録日*/
	@CreatedTimestamp
	private Date createDate;
	
	/* 更新日*/
	@UpdatedTimestamp
	private Date updateDate;
	
	/* 削除フラグ*/
	@NotNull
	private Integer delFlg;
	
}
