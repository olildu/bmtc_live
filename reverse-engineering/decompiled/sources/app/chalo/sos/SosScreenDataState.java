package app.chalo.sos;

import defpackage.cb0;
import defpackage.q7;
import defpackage.r30;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SosScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9406a;
    public final List b;
    public final List c;
    public final String d;
    public final SosScreenType e;
    public final boolean f;
    public final Map g;
    public final boolean h;

    public SosScreenDataState(String str, List contacts, List officialContacts, String str2, SosScreenType screenType, boolean z, Map map, boolean z2) {
        Intrinsics.i(contacts, "contacts");
        Intrinsics.i(officialContacts, "officialContacts");
        Intrinsics.i(screenType, "screenType");
        this.f9406a = str;
        this.b = contacts;
        this.c = officialContacts;
        this.d = str2;
        this.e = screenType;
        this.f = z;
        this.g = map;
        this.h = z2;
    }

    public static SosScreenDataState a(SosScreenDataState sosScreenDataState, String str, List list, List list2, String str2, SosScreenType sosScreenType, boolean z, Map map, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = sosScreenDataState.f9406a;
        }
        String sosMessage = str;
        if ((i & 2) != 0) {
            list = sosScreenDataState.b;
        }
        List contacts = list;
        if ((i & 4) != 0) {
            list2 = sosScreenDataState.c;
        }
        List officialContacts = list2;
        if ((i & 8) != 0) {
            str2 = sosScreenDataState.d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            sosScreenType = sosScreenDataState.e;
        }
        SosScreenType screenType = sosScreenType;
        if ((i & 32) != 0) {
            z = sosScreenDataState.f;
        }
        boolean z3 = z;
        Map map2 = (i & 64) != 0 ? sosScreenDataState.g : map;
        boolean z4 = (i & 128) != 0 ? sosScreenDataState.h : z2;
        sosScreenDataState.getClass();
        Intrinsics.i(sosMessage, "sosMessage");
        Intrinsics.i(contacts, "contacts");
        Intrinsics.i(officialContacts, "officialContacts");
        Intrinsics.i(screenType, "screenType");
        return new SosScreenDataState(sosMessage, contacts, officialContacts, str3, screenType, z3, map2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosScreenDataState)) {
            return false;
        }
        SosScreenDataState sosScreenDataState = (SosScreenDataState) obj;
        return Intrinsics.d(this.f9406a, sosScreenDataState.f9406a) && Intrinsics.d(this.b, sosScreenDataState.b) && Intrinsics.d(this.c, sosScreenDataState.c) && Intrinsics.d(this.d, sosScreenDataState.d) && this.e == sosScreenDataState.e && this.f == sosScreenDataState.f && Intrinsics.d(this.g, sosScreenDataState.g) && this.h == sosScreenDataState.h;
    }

    public final int hashCode() {
        int iB = r30.b(r30.b(this.f9406a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (((this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31;
        Map map = this.g;
        return ((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("SosScreenDataState(sosMessage=", this.f9406a, ", contacts=", ", officialContacts=", this.b);
        cb0.s(", sosMessageEditEntered=", this.d, ", screenType=", sbH, this.c);
        sbH.append(this.e);
        sbH.append(", showConfirmSosDialog=");
        sbH.append(this.f);
        sbH.append(", sosRequestParams=");
        sbH.append(this.g);
        sbH.append(", isSOSConfirmationDialogClicked=");
        sbH.append(this.h);
        sbH.append(")");
        return sbH.toString();
    }
}
