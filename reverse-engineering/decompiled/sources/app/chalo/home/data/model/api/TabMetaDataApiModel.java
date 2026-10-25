package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.jg1;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/TabMetaDataApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TabMetaDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] s = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(21)), null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2906a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final ChaloBusHeaderApiModel i;
    public final String j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final Integer o;
    public final String p;
    public final String q;
    public final SearchCardApiModel r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/TabMetaDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/TabMetaDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TabMetaDataApiModel> serializer() {
            return TabMetaDataApiModel$$serializer.f2907a;
        }
    }

    public /* synthetic */ TabMetaDataApiModel(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, ChaloBusHeaderApiModel chaloBusHeaderApiModel, String str8, String str9, Integer num, String str10, String str11, Integer num2, String str12, String str13, SearchCardApiModel searchCardApiModel) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.b(TabMetaDataApiModel$$serializer.f2907a.getDescriptor(), i, 12);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f2906a = null;
        } else {
            this.f2906a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = chaloBusHeaderApiModel;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str11;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str13;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = searchCardApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabMetaDataApiModel)) {
            return false;
        }
        TabMetaDataApiModel tabMetaDataApiModel = (TabMetaDataApiModel) obj;
        return Intrinsics.d(this.f2906a, tabMetaDataApiModel.f2906a) && Intrinsics.d(this.b, tabMetaDataApiModel.b) && Intrinsics.d(this.c, tabMetaDataApiModel.c) && Intrinsics.d(this.d, tabMetaDataApiModel.d) && Intrinsics.d(this.e, tabMetaDataApiModel.e) && Intrinsics.d(this.f, tabMetaDataApiModel.f) && Intrinsics.d(this.g, tabMetaDataApiModel.g) && Intrinsics.d(this.h, tabMetaDataApiModel.h) && Intrinsics.d(this.i, tabMetaDataApiModel.i) && Intrinsics.d(this.j, tabMetaDataApiModel.j) && Intrinsics.d(this.k, tabMetaDataApiModel.k) && Intrinsics.d(this.l, tabMetaDataApiModel.l) && Intrinsics.d(this.m, tabMetaDataApiModel.m) && Intrinsics.d(this.n, tabMetaDataApiModel.n) && Intrinsics.d(this.o, tabMetaDataApiModel.o) && Intrinsics.d(this.p, tabMetaDataApiModel.p) && Intrinsics.d(this.q, tabMetaDataApiModel.q) && Intrinsics.d(this.r, tabMetaDataApiModel.r);
    }

    public final int hashCode() {
        String str = this.f2906a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iE = nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        String str3 = this.e;
        int iHashCode2 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ChaloBusHeaderApiModel chaloBusHeaderApiModel = this.i;
        int iHashCode6 = (iHashCode5 + (chaloBusHeaderApiModel == null ? 0 : chaloBusHeaderApiModel.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.l;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.o;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.p;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        SearchCardApiModel searchCardApiModel = this.r;
        return iHashCode14 + (searchCardApiModel != null ? searchCardApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TabMetaDataApiModel(bgHighlightType=", this.f2906a, ", bgHighlightColor=", this.b, ", bottomNavIconIdSelected=");
        cb0.t(sbE, this.c, ", bottomNavIconIdUnselected=", this.d, ", headerIcon=");
        pk0.w(this.e, ", headerItems=", ", headerTitle=", sbE, this.f);
        cb0.t(sbE, this.g, ", searchBarTitle=", this.h, ", chaloBusHeaderData=");
        sbE.append(this.i);
        sbE.append(", storiesPlotlineWidgetId=");
        sbE.append(this.j);
        sbE.append(", bgHighlightImageUrl=");
        xs.u(this.l, this.k, ", bgHighlightImageBottomPadding=", ", payForTicketTitle=", sbE);
        cb0.t(sbE, this.m, ", payForTicketDesc=", this.n, ", tabBottomPadding=");
        gf.w(this.o, ", headerIconLink=", this.p, ", headerIconLinkTitle=", sbE);
        sbE.append(this.q);
        sbE.append(", searchCard=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }
}
