package app.chalo.home.ui.profile;

import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3614a;
    public final ProfileScreenBottomSheetType b;
    public final ProfileScreenDialogType c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public ProfileScreenViewState(List profilePageItemList, ProfileScreenBottomSheetType profileScreenBottomSheetType, ProfileScreenDialogType profileScreenDialogType, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        Intrinsics.i(profilePageItemList, "profilePageItemList");
        this.f3614a = profilePageItemList;
        this.b = profileScreenBottomSheetType;
        this.c = profileScreenDialogType;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
    }

    public static ProfileScreenViewState a(ProfileScreenViewState profileScreenViewState, List list, ProfileScreenBottomSheetType profileScreenBottomSheetType, ProfileScreenDialogType profileScreenDialogType, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            list = profileScreenViewState.f3614a;
        }
        List profilePageItemList = list;
        if ((i & 2) != 0) {
            profileScreenBottomSheetType = profileScreenViewState.b;
        }
        ProfileScreenBottomSheetType profileScreenBottomSheetType2 = profileScreenBottomSheetType;
        if ((i & 4) != 0) {
            profileScreenDialogType = profileScreenViewState.c;
        }
        ProfileScreenDialogType profileScreenDialogType2 = profileScreenDialogType;
        if ((i & 8) != 0) {
            z = profileScreenViewState.d;
        }
        boolean z6 = z;
        String versionCode = (i & 16) != 0 ? profileScreenViewState.e : str;
        boolean z7 = (i & 32) != 0 ? profileScreenViewState.f : z2;
        boolean z8 = (i & 64) != 0 ? profileScreenViewState.g : z3;
        String appTncLink = (i & 128) != 0 ? profileScreenViewState.h : str2;
        boolean z9 = (i & 256) != 0 ? profileScreenViewState.i : z4;
        boolean z10 = (i & 512) != 0 ? profileScreenViewState.j : z5;
        profileScreenViewState.getClass();
        Intrinsics.i(profilePageItemList, "profilePageItemList");
        Intrinsics.i(versionCode, "versionCode");
        Intrinsics.i(appTncLink, "appTncLink");
        return new ProfileScreenViewState(profilePageItemList, profileScreenBottomSheetType2, profileScreenDialogType2, z6, versionCode, z7, z8, appTncLink, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileScreenViewState)) {
            return false;
        }
        ProfileScreenViewState profileScreenViewState = (ProfileScreenViewState) obj;
        return Intrinsics.d(this.f3614a, profileScreenViewState.f3614a) && Intrinsics.d(this.b, profileScreenViewState.b) && Intrinsics.d(this.c, profileScreenViewState.c) && this.d == profileScreenViewState.d && Intrinsics.d(this.e, profileScreenViewState.e) && this.f == profileScreenViewState.f && this.g == profileScreenViewState.g && Intrinsics.d(this.h, profileScreenViewState.h) && this.i == profileScreenViewState.i && this.j == profileScreenViewState.j;
    }

    public final int hashCode() {
        int iHashCode = this.f3614a.hashCode() * 31;
        ProfileScreenBottomSheetType profileScreenBottomSheetType = this.b;
        int iHashCode2 = (iHashCode + (profileScreenBottomSheetType == null ? 0 : profileScreenBottomSheetType.hashCode())) * 31;
        ProfileScreenDialogType profileScreenDialogType = this.c;
        return ((nf1.e((((nf1.e((((iHashCode2 + (profileScreenDialogType != null ? profileScreenDialogType.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31, this.h) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileScreenViewState(profilePageItemList=");
        sb.append(this.f3614a);
        sb.append(", bottomSheetType=");
        sb.append(this.b);
        sb.append(", dialogType=");
        sb.append(this.c);
        sb.append(", isAccountSettingsActionInProgress=");
        sb.append(this.d);
        sb.append(", versionCode=");
        t10.s(this.e, ", isDebugBuild=", ", showEnvironmentChangeDialog=", sb, this.f);
        pk0.x(", appTncLink=", this.h, ", showJuspayLoader=", sb, this.g);
        return n21.h(sb, this.i, ", isJuspayOperationInProgress=", this.j, ")");
    }
}
