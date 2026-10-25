package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.p41;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/SectionItemApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SectionItemApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p41(24)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2904a;
    public final String b;
    public final int c;
    public final ItemTextDataApiModel d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final String n;
    public final String o;
    public final Integer p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/SectionItemApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/SectionItemApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SectionItemApiModel> serializer() {
            return SectionItemApiModel$$serializer.f2905a;
        }
    }

    public /* synthetic */ SectionItemApiModel(int i, String str, String str2, int i2, ItemTextDataApiModel itemTextDataApiModel, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, Boolean bool, String str10, String str11, Integer num) {
        if (68 != (i & 68)) {
            PluginExceptionsKt.b(SectionItemApiModel$$serializer.f2905a.getDescriptor(), i, 68);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f2904a = null;
        } else {
            this.f2904a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = i2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = itemTextDataApiModel;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        this.g = str5;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str11;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionItemApiModel)) {
            return false;
        }
        SectionItemApiModel sectionItemApiModel = (SectionItemApiModel) obj;
        return Intrinsics.d(this.f2904a, sectionItemApiModel.f2904a) && Intrinsics.d(this.b, sectionItemApiModel.b) && this.c == sectionItemApiModel.c && Intrinsics.d(this.d, sectionItemApiModel.d) && Intrinsics.d(this.e, sectionItemApiModel.e) && Intrinsics.d(this.f, sectionItemApiModel.f) && Intrinsics.d(this.g, sectionItemApiModel.g) && Intrinsics.d(this.h, sectionItemApiModel.h) && Intrinsics.d(this.i, sectionItemApiModel.i) && Intrinsics.d(this.j, sectionItemApiModel.j) && Intrinsics.d(this.k, sectionItemApiModel.k) && Intrinsics.d(this.l, sectionItemApiModel.l) && Intrinsics.d(this.m, sectionItemApiModel.m) && Intrinsics.d(this.n, sectionItemApiModel.n) && Intrinsics.d(this.o, sectionItemApiModel.o) && Intrinsics.d(this.p, sectionItemApiModel.p);
    }

    public final int hashCode() {
        String str = this.f2904a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31;
        ItemTextDataApiModel itemTextDataApiModel = this.d;
        int iHashCode3 = (iHashCode2 + (itemTextDataApiModel == null ? 0 : itemTextDataApiModel.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iE = nf1.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        int iHashCode5 = (iE + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.o;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.p;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SectionItemApiModel(itemBgColor=", this.f2904a, ", itemImageUrl=", this.b, ", itemPosition=");
        sbE.append(this.c);
        sbE.append(", itemTextData=");
        sbE.append(this.d);
        sbE.append(", itemTitle=");
        cb0.t(sbE, this.e, ", itemDesc=", this.f, ", itemType=");
        cb0.t(sbE, this.g, ", itemCta=", this.h, ", ctaDisplayType=");
        pk0.w(this.i, ", passCardDataList=", ", iconId=", sbE, this.j);
        cb0.t(sbE, this.k, ", itemFallbackImage=", this.l, ", itemFullWidth=");
        hq0.t(this.m, ", onClickUrl=", this.n, ", ctaType=", sbE);
        sbE.append(this.o);
        sbE.append(", contentPadding=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }
}
