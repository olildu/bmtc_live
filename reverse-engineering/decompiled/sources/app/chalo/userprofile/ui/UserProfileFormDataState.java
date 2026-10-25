package app.chalo.userprofile.ui;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormDataState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfileFormDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10349a;
    public final Gender b;
    public final String c;
    public final String d;
    public final Long e;
    public final boolean f;
    public final List g;
    public final String h;
    public final UserProfileFieldType i;
    public final String j;
    public final BitmapImage k;
    public final boolean l;
    public final UserProfileFormDialogType m;
    public final List n;

    public UserProfileFormDataState(String name, Gender gender, String emailId, String age, Long l, boolean z, List genderOptions, String phoneNumber, UserProfileFieldType userProfileFieldType, String str, BitmapImage bitmapImage, boolean z2, UserProfileFormDialogType userProfileFormDialogType, List errorMsgList) {
        Intrinsics.i(name, "name");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(emailId, "emailId");
        Intrinsics.i(age, "age");
        Intrinsics.i(genderOptions, "genderOptions");
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(errorMsgList, "errorMsgList");
        this.f10349a = name;
        this.b = gender;
        this.c = emailId;
        this.d = age;
        this.e = l;
        this.f = z;
        this.g = genderOptions;
        this.h = phoneNumber;
        this.i = userProfileFieldType;
        this.j = str;
        this.k = bitmapImage;
        this.l = z2;
        this.m = userProfileFormDialogType;
        this.n = errorMsgList;
    }

    public static UserProfileFormDataState a(UserProfileFormDataState userProfileFormDataState, String str, Gender gender, String str2, String str3, Long l, UserProfileFieldType userProfileFieldType, String str4, BitmapImage bitmapImage, boolean z, UserProfileFormDialogType userProfileFormDialogType, List list, int i) {
        String name = (i & 1) != 0 ? userProfileFormDataState.f10349a : str;
        Gender gender2 = (i & 2) != 0 ? userProfileFormDataState.b : gender;
        String emailId = (i & 4) != 0 ? userProfileFormDataState.c : str2;
        String age = (i & 8) != 0 ? userProfileFormDataState.d : str3;
        Long l2 = (i & 16) != 0 ? userProfileFormDataState.e : l;
        boolean z2 = userProfileFormDataState.f;
        List genderOptions = userProfileFormDataState.g;
        String phoneNumber = userProfileFormDataState.h;
        UserProfileFieldType userProfileFieldType2 = (i & 256) != 0 ? userProfileFormDataState.i : userProfileFieldType;
        String str5 = (i & 512) != 0 ? userProfileFormDataState.j : str4;
        BitmapImage bitmapImage2 = (i & 1024) != 0 ? userProfileFormDataState.k : bitmapImage;
        boolean z3 = (i & 2048) != 0 ? userProfileFormDataState.l : z;
        UserProfileFormDialogType userProfileFormDialogType2 = (i & 4096) != 0 ? userProfileFormDataState.m : userProfileFormDialogType;
        List errorMsgList = (i & 8192) != 0 ? userProfileFormDataState.n : list;
        userProfileFormDataState.getClass();
        Intrinsics.i(name, "name");
        Intrinsics.i(gender2, "gender");
        Intrinsics.i(emailId, "emailId");
        Intrinsics.i(age, "age");
        Intrinsics.i(genderOptions, "genderOptions");
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(errorMsgList, "errorMsgList");
        return new UserProfileFormDataState(name, gender2, emailId, age, l2, z2, genderOptions, phoneNumber, userProfileFieldType2, str5, bitmapImage2, z3, userProfileFormDialogType2, errorMsgList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileFormDataState)) {
            return false;
        }
        UserProfileFormDataState userProfileFormDataState = (UserProfileFormDataState) obj;
        return Intrinsics.d(this.f10349a, userProfileFormDataState.f10349a) && this.b == userProfileFormDataState.b && Intrinsics.d(this.c, userProfileFormDataState.c) && Intrinsics.d(this.d, userProfileFormDataState.d) && Intrinsics.d(this.e, userProfileFormDataState.e) && this.f == userProfileFormDataState.f && Intrinsics.d(this.g, userProfileFormDataState.g) && Intrinsics.d(this.h, userProfileFormDataState.h) && Intrinsics.d(this.i, userProfileFormDataState.i) && Intrinsics.d(this.j, userProfileFormDataState.j) && Intrinsics.d(this.k, userProfileFormDataState.k) && this.l == userProfileFormDataState.l && Intrinsics.d(this.m, userProfileFormDataState.m) && Intrinsics.d(this.n, userProfileFormDataState.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((this.b.hashCode() + (this.f10349a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int iE2 = nf1.e(r30.b((((iE + (l == null ? 0 : l.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g), 31, this.h);
        UserProfileFieldType userProfileFieldType = this.i;
        int iHashCode = (iE2 + (userProfileFieldType == null ? 0 : userProfileFieldType.hashCode())) * 31;
        String str = this.j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BitmapImage bitmapImage = this.k;
        int iHashCode3 = (((iHashCode2 + (bitmapImage == null ? 0 : bitmapImage.hashCode())) * 31) + (this.l ? 1231 : 1237)) * 31;
        UserProfileFormDialogType userProfileFormDialogType = this.m;
        return this.n.hashCode() + ((iHashCode3 + (userProfileFormDialogType != null ? userProfileFormDialogType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileFormDataState(name=");
        sb.append(this.f10349a);
        sb.append(", gender=");
        sb.append(this.b);
        sb.append(", emailId=");
        cb0.t(sb, this.c, ", age=", this.d, ", dobInMillis=");
        sb.append(this.e);
        sb.append(", collectNameAlongWithDob=");
        sb.append(this.f);
        sb.append(", genderOptions=");
        cb0.s(", phoneNumber=", this.h, ", fieldInFocus=", sb, this.g);
        sb.append(this.i);
        sb.append(", profilePhotoUrl=");
        sb.append(this.j);
        sb.append(", newSelectedPhotoBitmap=");
        sb.append(this.k);
        sb.append(", isLoading=");
        sb.append(this.l);
        sb.append(", dialogType=");
        sb.append(this.m);
        sb.append(", errorMsgList=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public UserProfileFormDataState(String str, Gender gender, String str2, String str3, Long l, boolean z, List list, String str4, String str5, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Gender.NULL : gender, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? false : z, (i & 64) != 0 ? EmptyList.f17557a : list, (i & 128) != 0 ? "" : str4, null, (i & 512) != 0 ? null : str5, null, false, null, EmptyList.f17557a);
    }
}
