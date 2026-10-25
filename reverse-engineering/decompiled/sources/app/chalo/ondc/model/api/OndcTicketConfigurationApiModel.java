package app.chalo.ondc.model.api;

import app.chalo.instantticket.config.models.BrandingDetails;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/OndcTicketConfigurationApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketConfigurationApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final OndcTicketConfigurationApiModel l = new OndcTicketConfigurationApiModel(new BrandingDetails(false));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6730a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final Integer h;
    public final BrandingDetails i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/OndcTicketConfigurationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/OndcTicketConfigurationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketConfigurationApiModel> serializer() {
            return OndcTicketConfigurationApiModel$$serializer.f6731a;
        }
    }

    public /* synthetic */ OndcTicketConfigurationApiModel(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, Integer num, BrandingDetails brandingDetails, String str6, String str7) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(OndcTicketConfigurationApiModel$$serializer.f6731a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f6730a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = bool2;
        this.g = str5;
        this.h = num;
        this.i = brandingDetails;
        this.j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketConfigurationApiModel)) {
            return false;
        }
        OndcTicketConfigurationApiModel ondcTicketConfigurationApiModel = (OndcTicketConfigurationApiModel) obj;
        return Intrinsics.d(this.f6730a, ondcTicketConfigurationApiModel.f6730a) && Intrinsics.d(this.b, ondcTicketConfigurationApiModel.b) && Intrinsics.d(this.c, ondcTicketConfigurationApiModel.c) && Intrinsics.d(this.d, ondcTicketConfigurationApiModel.d) && Intrinsics.d(this.e, ondcTicketConfigurationApiModel.e) && Intrinsics.d(this.f, ondcTicketConfigurationApiModel.f) && Intrinsics.d(this.g, ondcTicketConfigurationApiModel.g) && Intrinsics.d(this.h, ondcTicketConfigurationApiModel.h) && Intrinsics.d(this.i, ondcTicketConfigurationApiModel.i) && Intrinsics.d(this.j, ondcTicketConfigurationApiModel.j) && Intrinsics.d(this.k, ondcTicketConfigurationApiModel.k);
    }

    public final int hashCode() {
        String str = this.f6730a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        BrandingDetails brandingDetails = this.i;
        int iHashCode9 = (iHashCode8 + (brandingDetails == null ? 0 : brandingDetails.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcTicketConfigurationApiModel(id=", this.f6730a, ", name=", this.b, ", city=");
        cb0.t(sbE, this.c, ", agency=", this.d, ", isActive=");
        hq0.u(sbE, this.e, ", isVisible=", this.f, ", productValidationType=");
        xs.u(this.h, this.g, ", minAppVer=", ", branding=", sbE);
        sbE.append(this.i);
        sbE.append(", productType=");
        sbE.append(this.j);
        sbE.append(", productSubType=");
        return vo1.p(sbE, this.k, ")");
    }

    public OndcTicketConfigurationApiModel(BrandingDetails brandingDetails) {
        Boolean bool = Boolean.FALSE;
        this.f6730a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = bool;
        this.f = bool;
        this.g = null;
        this.h = 0;
        this.i = brandingDetails;
        this.j = "";
        this.k = "";
    }
}
