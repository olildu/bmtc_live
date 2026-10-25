package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDataState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinProfileUpdateDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileAppModel f10390a;
    public final List b;
    public final List c;
    public final int d;
    public final boolean e;
    public final String f;
    public final BitmapImage g;
    public final MinProfileUpdateDialogType h;

    public MinProfileUpdateDataState(UserProfileAppModel userProfileAppModel, List profileInputSequence, List genderOptions, int i, boolean z, String str, BitmapImage bitmapImage, MinProfileUpdateDialogType minProfileUpdateDialogType) {
        Intrinsics.i(profileInputSequence, "profileInputSequence");
        Intrinsics.i(genderOptions, "genderOptions");
        this.f10390a = userProfileAppModel;
        this.b = profileInputSequence;
        this.c = genderOptions;
        this.d = i;
        this.e = z;
        this.f = str;
        this.g = bitmapImage;
        this.h = minProfileUpdateDialogType;
    }

    public static MinProfileUpdateDataState a(MinProfileUpdateDataState minProfileUpdateDataState, UserProfileAppModel userProfileAppModel, List list, List list2, int i, boolean z, String str, BitmapImage bitmapImage, MinProfileUpdateDialogType minProfileUpdateDialogType, int i2) {
        if ((i2 & 1) != 0) {
            userProfileAppModel = minProfileUpdateDataState.f10390a;
        }
        UserProfileAppModel userProfileAppModel2 = userProfileAppModel;
        if ((i2 & 2) != 0) {
            list = minProfileUpdateDataState.b;
        }
        List profileInputSequence = list;
        if ((i2 & 4) != 0) {
            list2 = minProfileUpdateDataState.c;
        }
        List genderOptions = list2;
        if ((i2 & 8) != 0) {
            i = minProfileUpdateDataState.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = minProfileUpdateDataState.e;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str = minProfileUpdateDataState.f;
        }
        String str2 = str;
        BitmapImage bitmapImage2 = (i2 & 64) != 0 ? minProfileUpdateDataState.g : bitmapImage;
        MinProfileUpdateDialogType minProfileUpdateDialogType2 = (i2 & 128) != 0 ? minProfileUpdateDataState.h : minProfileUpdateDialogType;
        minProfileUpdateDataState.getClass();
        Intrinsics.i(profileInputSequence, "profileInputSequence");
        Intrinsics.i(genderOptions, "genderOptions");
        return new MinProfileUpdateDataState(userProfileAppModel2, profileInputSequence, genderOptions, i3, z2, str2, bitmapImage2, minProfileUpdateDialogType2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinProfileUpdateDataState)) {
            return false;
        }
        MinProfileUpdateDataState minProfileUpdateDataState = (MinProfileUpdateDataState) obj;
        return Intrinsics.d(this.f10390a, minProfileUpdateDataState.f10390a) && Intrinsics.d(this.b, minProfileUpdateDataState.b) && Intrinsics.d(this.c, minProfileUpdateDataState.c) && this.d == minProfileUpdateDataState.d && this.e == minProfileUpdateDataState.e && Intrinsics.d(this.f, minProfileUpdateDataState.f) && Intrinsics.d(this.g, minProfileUpdateDataState.g) && Intrinsics.d(this.h, minProfileUpdateDataState.h);
    }

    public final int hashCode() {
        UserProfileAppModel userProfileAppModel = this.f10390a;
        int iB = (((r30.b(r30.b((userProfileAppModel == null ? 0 : userProfileAppModel.hashCode()) * 31, 31, this.b), 31, this.c) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31;
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        BitmapImage bitmapImage = this.g;
        int iHashCode2 = (iHashCode + (bitmapImage == null ? 0 : bitmapImage.hashCode())) * 31;
        MinProfileUpdateDialogType minProfileUpdateDialogType = this.h;
        return iHashCode2 + (minProfileUpdateDialogType != null ? minProfileUpdateDialogType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinProfileUpdateDataState(initialProfile=");
        sb.append(this.f10390a);
        sb.append(", profileInputSequence=");
        sb.append(this.b);
        sb.append(", genderOptions=");
        sb.append(this.c);
        sb.append(", currentInputIndex=");
        sb.append(this.d);
        sb.append(", isLoading=");
        pk0.x(", profilePhotoUrl=", this.f, ", newSelectedPhotoBitmap=", sb, this.e);
        sb.append(this.g);
        sb.append(", dialogType=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
