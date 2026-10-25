package app.chalo.instantticket.config.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.ea0;
import defpackage.hq0;
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
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/config/models/InstantTicketConfigurationApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketConfigurationApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ea0(9))};
    public static final InstantTicketConfigurationApiModel o = new InstantTicketConfigurationApiModel(new BrandingDetails(false), new FareInfo(0, 0), EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3833a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final BrandingDetails f;
    public final String g;
    public final String h;
    public final FareInfo i;
    public final Long j;
    public final Boolean k;
    public final Boolean l;
    public final List m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/config/models/InstantTicketConfigurationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/config/models/InstantTicketConfigurationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketConfigurationApiModel> serializer() {
            return InstantTicketConfigurationApiModel$$serializer.f3834a;
        }
    }

    public /* synthetic */ InstantTicketConfigurationApiModel(int i, String str, String str2, String str3, String str4, Boolean bool, BrandingDetails brandingDetails, String str5, String str6, FareInfo fareInfo, Long l, Boolean bool2, Boolean bool3, List list) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.b(InstantTicketConfigurationApiModel$$serializer.f3834a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f3833a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = brandingDetails;
        this.g = str5;
        this.h = str6;
        this.i = fareInfo;
        this.j = l;
        this.k = bool2;
        this.l = bool3;
        this.m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketConfigurationApiModel)) {
            return false;
        }
        InstantTicketConfigurationApiModel instantTicketConfigurationApiModel = (InstantTicketConfigurationApiModel) obj;
        return Intrinsics.d(this.f3833a, instantTicketConfigurationApiModel.f3833a) && Intrinsics.d(this.b, instantTicketConfigurationApiModel.b) && Intrinsics.d(this.c, instantTicketConfigurationApiModel.c) && Intrinsics.d(this.d, instantTicketConfigurationApiModel.d) && Intrinsics.d(this.e, instantTicketConfigurationApiModel.e) && Intrinsics.d(this.f, instantTicketConfigurationApiModel.f) && Intrinsics.d(this.g, instantTicketConfigurationApiModel.g) && Intrinsics.d(this.h, instantTicketConfigurationApiModel.h) && Intrinsics.d(this.i, instantTicketConfigurationApiModel.i) && Intrinsics.d(this.j, instantTicketConfigurationApiModel.j) && Intrinsics.d(this.k, instantTicketConfigurationApiModel.k) && Intrinsics.d(this.l, instantTicketConfigurationApiModel.l) && Intrinsics.d(this.m, instantTicketConfigurationApiModel.m);
    }

    public final int hashCode() {
        String str = this.f3833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BrandingDetails brandingDetails = this.f;
        int iHashCode6 = (iHashCode5 + (brandingDetails == null ? 0 : brandingDetails.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        FareInfo fareInfo = this.i;
        int iHashCode9 = (iHashCode8 + (fareInfo == null ? 0 : fareInfo.hashCode())) * 31;
        Long l = this.j;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.m;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketConfigurationApiModel(id=", this.f3833a, ", name=", this.b, ", city=");
        cb0.t(sbE, this.c, ", agency=", this.d, ", isActive=");
        sbE.append(this.e);
        sbE.append(", branding=");
        sbE.append(this.f);
        sbE.append(", productType=");
        cb0.t(sbE, this.g, ", productSubType=", this.h, ", fareInfo=");
        sbE.append(this.i);
        sbE.append(", activeDuration=");
        sbE.append(this.j);
        sbE.append(", showOtherModes=");
        hq0.u(sbE, this.k, ", showFindMyFare=", this.l, ", productImageUrls=");
        return xs.l(sbE, this.m, ")");
    }

    public InstantTicketConfigurationApiModel(BrandingDetails brandingDetails, FareInfo fareInfo, List list) {
        Boolean bool = Boolean.FALSE;
        this.f3833a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = bool;
        this.f = brandingDetails;
        this.g = "";
        this.h = "";
        this.i = fareInfo;
        this.j = 0L;
        this.k = bool;
        this.l = bool;
        this.m = list;
    }
}
