package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.p41;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/SectionItemAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SectionItemAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3812a;
    public final String b;
    public final int c;
    public final ItemTextDataAppModel d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final IconType k;
    public final IconType l;
    public final boolean m;
    public final String n;
    public final String o;
    public final Integer p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/SectionItemAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/SectionItemAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SectionItemAppModel> serializer() {
            return SectionItemAppModel$$serializer.f3813a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new p41(25)), LazyKt.a(lazyThreadSafetyMode, new p41(26)), LazyKt.a(lazyThreadSafetyMode, new p41(27)), null, null, null, null};
    }

    public SectionItemAppModel(int i, String str, String str2, int i2, ItemTextDataAppModel itemTextDataAppModel, String str3, String str4, String str5, String str6, String str7, List list, IconType iconType, IconType iconType2, boolean z, String str8, String str9, Integer num) {
        if (68 != (i & 68)) {
            PluginExceptionsKt.b(SectionItemAppModel$$serializer.f3813a.getDescriptor(), i, 68);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f3812a = null;
        } else {
            this.f3812a = str;
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
            this.d = itemTextDataAppModel;
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
            this.j = EmptyList.f17557a;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = iconType;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = iconType2;
        }
        this.m = (i & 4096) == 0 ? false : z;
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
            this.p = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionItemAppModel)) {
            return false;
        }
        SectionItemAppModel sectionItemAppModel = (SectionItemAppModel) obj;
        return Intrinsics.d(this.f3812a, sectionItemAppModel.f3812a) && Intrinsics.d(this.b, sectionItemAppModel.b) && this.c == sectionItemAppModel.c && Intrinsics.d(this.d, sectionItemAppModel.d) && Intrinsics.d(this.e, sectionItemAppModel.e) && Intrinsics.d(this.f, sectionItemAppModel.f) && Intrinsics.d(this.g, sectionItemAppModel.g) && Intrinsics.d(this.h, sectionItemAppModel.h) && Intrinsics.d(this.i, sectionItemAppModel.i) && Intrinsics.d(this.j, sectionItemAppModel.j) && this.k == sectionItemAppModel.k && this.l == sectionItemAppModel.l && this.m == sectionItemAppModel.m && Intrinsics.d(this.n, sectionItemAppModel.n) && Intrinsics.d(this.o, sectionItemAppModel.o) && Intrinsics.d(this.p, sectionItemAppModel.p);
    }

    public final int hashCode() {
        String str = this.f3812a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31;
        ItemTextDataAppModel itemTextDataAppModel = this.d;
        int iHashCode3 = (iHashCode2 + (itemTextDataAppModel == null ? 0 : itemTextDataAppModel.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iE = nf1.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        int iHashCode5 = (iE + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iB = r30.b((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.j);
        IconType iconType = this.k;
        int iHashCode6 = (iB + (iconType == null ? 0 : iconType.hashCode())) * 31;
        IconType iconType2 = this.l;
        int iHashCode7 = (((iHashCode6 + (iconType2 == null ? 0 : iconType2.hashCode())) * 31) + (this.m ? 1231 : 1237)) * 31;
        String str7 = this.n;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.p;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SectionItemAppModel(itemBgColor=", this.f3812a, ", itemImageUrl=", this.b, ", itemPosition=");
        sbE.append(this.c);
        sbE.append(", itemTextData=");
        sbE.append(this.d);
        sbE.append(", itemTitle=");
        cb0.t(sbE, this.e, ", itemDesc=", this.f, ", itemType=");
        cb0.t(sbE, this.g, ", itemCta=", this.h, ", ctaDisplayType=");
        pk0.w(this.i, ", passCardDataList=", ", icon=", sbE, this.j);
        sbE.append(this.k);
        sbE.append(", itemFallbackImage=");
        sbE.append(this.l);
        sbE.append(", itemFullWidth=");
        pk0.x(", onClickUrl=", this.n, ", ctaType=", sbE, this.m);
        sbE.append(this.o);
        sbE.append(", contentPadding=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }

    public SectionItemAppModel(String str, String str2, int i, ItemTextDataAppModel itemTextDataAppModel, String str3, String str4, String itemType, String str5, String str6, List passCardDataList, IconType iconType, IconType iconType2, boolean z, String str7, String str8, Integer num) {
        Intrinsics.i(itemType, "itemType");
        Intrinsics.i(passCardDataList, "passCardDataList");
        this.f3812a = str;
        this.b = str2;
        this.c = i;
        this.d = itemTextDataAppModel;
        this.e = str3;
        this.f = str4;
        this.g = itemType;
        this.h = str5;
        this.i = str6;
        this.j = passCardDataList;
        this.k = iconType;
        this.l = iconType2;
        this.m = z;
        this.n = str7;
        this.o = str8;
        this.p = num;
    }
}
