package app.chalo.login.ui.userconsent;

import app.chalo.userconsent.UserConsentFlowType;
import defpackage.n21;
import defpackage.t10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentDataState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserConsentDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserConsentFlowType f5349a;
    public final List b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public UserConsentDataState(UserConsentFlowType userConsentFlowType, List list, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        this.f5349a = userConsentFlowType;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static UserConsentDataState a(UserConsentDataState userConsentDataState, UserConsentFlowType userConsentFlowType, ArrayList arrayList, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            userConsentFlowType = userConsentDataState.f5349a;
        }
        UserConsentFlowType userConsentFlowType2 = userConsentFlowType;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = userConsentDataState.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = userConsentDataState.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = userConsentDataState.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            str2 = userConsentDataState.e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z2 = userConsentDataState.f;
        }
        boolean z6 = z2;
        boolean z7 = (i & 64) != 0 ? userConsentDataState.g : z3;
        boolean z8 = (i & 128) != 0 ? userConsentDataState.h : z4;
        userConsentDataState.getClass();
        return new UserConsentDataState(userConsentFlowType2, list2, str3, z5, str4, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentDataState)) {
            return false;
        }
        UserConsentDataState userConsentDataState = (UserConsentDataState) obj;
        return Intrinsics.d(this.f5349a, userConsentDataState.f5349a) && Intrinsics.d(this.b, userConsentDataState.b) && Intrinsics.d(this.c, userConsentDataState.c) && this.d == userConsentDataState.d && Intrinsics.d(this.e, userConsentDataState.e) && this.f == userConsentDataState.f && this.g == userConsentDataState.g && this.h == userConsentDataState.h;
    }

    public final int hashCode() {
        UserConsentFlowType userConsentFlowType = this.f5349a;
        int iHashCode = (userConsentFlowType == null ? 0 : userConsentFlowType.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        return ((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserConsentDataState(flowType=");
        sb.append(this.f5349a);
        sb.append(", userConsentStatus=");
        sb.append(this.b);
        sb.append(", tncUrl=");
        t10.s(this.c, ", showLoading=", ", fullScreenError=", sb, this.d);
        t10.s(this.e, ", showConsentRequiredReasonDialog=", ", showWebPageLoader=", sb, this.f);
        return n21.h(sb, this.g, ", isSkipOptionEnabled=", this.h, ")");
    }
}
