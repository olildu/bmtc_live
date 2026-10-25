package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.gf;
import defpackage.jg1;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TabMetaDataAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TabMetaDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BgHighlightType f3814a;
    public final String b;
    public final IconType c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final ChaloBusHeaderAppModel h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;
    public final SearchCardAppModel p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TabMetaDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/TabMetaDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TabMetaDataAppModel> serializer() {
            return TabMetaDataAppModel$$serializer.f3815a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new jg1(22)), null, LazyKt.a(lazyThreadSafetyMode, new jg1(23)), LazyKt.a(lazyThreadSafetyMode, new jg1(24)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public TabMetaDataAppModel(int i, BgHighlightType bgHighlightType, String str, IconType iconType, List list, String str2, String str3, String str4, ChaloBusHeaderAppModel chaloBusHeaderAppModel, String str5, Integer num, String str6, String str7, Integer num2, String str8, String str9, SearchCardAppModel searchCardAppModel) {
        this.f3814a = (i & 1) == 0 ? BgHighlightType.UNKNOWN : bgHighlightType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iconType;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.f17557a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = chaloBusHeaderAppModel;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str9;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = searchCardAppModel;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BgHighlightType getF3814a() {
        return this.f3814a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabMetaDataAppModel)) {
            return false;
        }
        TabMetaDataAppModel tabMetaDataAppModel = (TabMetaDataAppModel) obj;
        return this.f3814a == tabMetaDataAppModel.f3814a && Intrinsics.d(this.b, tabMetaDataAppModel.b) && this.c == tabMetaDataAppModel.c && Intrinsics.d(this.d, tabMetaDataAppModel.d) && Intrinsics.d(this.e, tabMetaDataAppModel.e) && Intrinsics.d(this.f, tabMetaDataAppModel.f) && Intrinsics.d(this.g, tabMetaDataAppModel.g) && Intrinsics.d(this.h, tabMetaDataAppModel.h) && Intrinsics.d(this.i, tabMetaDataAppModel.i) && Intrinsics.d(this.j, tabMetaDataAppModel.j) && Intrinsics.d(this.k, tabMetaDataAppModel.k) && Intrinsics.d(this.l, tabMetaDataAppModel.l) && Intrinsics.d(this.m, tabMetaDataAppModel.m) && Intrinsics.d(this.n, tabMetaDataAppModel.n) && Intrinsics.d(this.o, tabMetaDataAppModel.o) && Intrinsics.d(this.p, tabMetaDataAppModel.p);
    }

    public final int hashCode() {
        int iHashCode = this.f3814a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconType iconType = this.c;
        int iE = nf1.e(nf1.e(nf1.e(r30.b((iHashCode2 + (iconType == null ? 0 : iconType.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        ChaloBusHeaderAppModel chaloBusHeaderAppModel = this.h;
        int iHashCode3 = (iE + (chaloBusHeaderAppModel == null ? 0 : chaloBusHeaderAppModel.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.m;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SearchCardAppModel searchCardAppModel = this.p;
        return iHashCode10 + (searchCardAppModel != null ? searchCardAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabMetaDataAppModel(bgHighlightType=");
        sb.append(this.f3814a);
        sb.append(", bgHighlightColor=");
        sb.append(this.b);
        sb.append(", headerIcon=");
        sb.append(this.c);
        sb.append(", headerItems=");
        sb.append(this.d);
        sb.append(", headerTitle=");
        cb0.t(sb, this.e, ", searchBarTitle=", this.f, ", storiesPlotlineWidgetId=");
        sb.append(this.g);
        sb.append(", chaloBusHeaderAppModel=");
        sb.append(this.h);
        sb.append(", bgHighlightImageUrl=");
        xs.u(this.j, this.i, ", bgHighlightImageBottomPadding=", ", payForTicketTitle=", sb);
        cb0.t(sb, this.k, ", payForTicketDesc=", this.l, ", tabBottomPadding=");
        gf.w(this.m, ", headerIconLink=", this.n, ", headerIconLinkTitle=", sb);
        sb.append(this.o);
        sb.append(", searchCard=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public TabMetaDataAppModel(BgHighlightType bgHighlightType, String str, IconType iconType, List headerItems, String headerTitle, String searchBarTitle, String storiesPlotlineWidgetId, ChaloBusHeaderAppModel chaloBusHeaderAppModel, String str2, Integer num, String str3, String str4, Integer num2, String str5, String str6, SearchCardAppModel searchCardAppModel) {
        Intrinsics.i(bgHighlightType, "bgHighlightType");
        Intrinsics.i(headerItems, "headerItems");
        Intrinsics.i(headerTitle, "headerTitle");
        Intrinsics.i(searchBarTitle, "searchBarTitle");
        Intrinsics.i(storiesPlotlineWidgetId, "storiesPlotlineWidgetId");
        this.f3814a = bgHighlightType;
        this.b = str;
        this.c = iconType;
        this.d = headerItems;
        this.e = headerTitle;
        this.f = searchBarTitle;
        this.g = storiesPlotlineWidgetId;
        this.h = chaloBusHeaderAppModel;
        this.i = str2;
        this.j = num;
        this.k = str3;
        this.l = str4;
        this.m = num2;
        this.n = str5;
        this.o = str6;
        this.p = searchCardAppModel;
    }

    public TabMetaDataAppModel() {
        this(BgHighlightType.UNKNOWN, null, null, EmptyList.f17557a, "", "", "", null, null, null, null, null, null, null, null, null);
    }
}
