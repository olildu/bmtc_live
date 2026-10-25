package app.chalo.ondc.model.api;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.yn0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/OndcTicketConfiguration;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Lazy[] l;
    public static final OndcTicketConfiguration m;
    public static final String n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6728a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Boolean f;
    public final ProductValidationType g;
    public final Integer h;
    public final BrandingDetails i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/OndcTicketConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/OndcTicketConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketConfiguration> serializer() {
            return OndcTicketConfiguration$$serializer.f6729a;
        }
    }

    static {
        Companion companion = new Companion();
        INSTANCE = companion;
        String strA = null;
        l = new Lazy[]{null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(14)), null, null, null, null};
        OndcTicketConfigurationApiModel.INSTANCE.getClass();
        Boolean bool = Boolean.FALSE;
        ProductValidationType.INSTANCE.getClass();
        ProductValidationType productValidationTypeA = ProductValidationType.Companion.a(null);
        BrandingDetails brandingDetails = OndcTicketConfigurationApiModel.l.i;
        if (brandingDetails == null) {
            brandingDetails = new BrandingDetails(false);
        }
        OndcTicketConfiguration ondcTicketConfiguration = new OndcTicketConfiguration("", "", "", "", false, bool, productValidationTypeA, 0, brandingDetails, "", "");
        m = ondcTicketConfiguration;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(BuiltinSerializersKt.c(companion.serializer()), ondcTicketConfiguration);
        } catch (Exception unused) {
        }
        if (strA == null) {
            strA = "";
        }
        n = strA;
    }

    public /* synthetic */ OndcTicketConfiguration(int i, String str, String str2, String str3, String str4, boolean z, Boolean bool, ProductValidationType productValidationType, Integer num, BrandingDetails brandingDetails, String str5, String str6) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(OndcTicketConfiguration$$serializer.f6729a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f6728a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = bool;
        this.g = productValidationType;
        this.h = num;
        this.i = brandingDetails;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketConfiguration)) {
            return false;
        }
        OndcTicketConfiguration ondcTicketConfiguration = (OndcTicketConfiguration) obj;
        return Intrinsics.d(this.f6728a, ondcTicketConfiguration.f6728a) && Intrinsics.d(this.b, ondcTicketConfiguration.b) && Intrinsics.d(this.c, ondcTicketConfiguration.c) && Intrinsics.d(this.d, ondcTicketConfiguration.d) && this.e == ondcTicketConfiguration.e && Intrinsics.d(this.f, ondcTicketConfiguration.f) && this.g == ondcTicketConfiguration.g && Intrinsics.d(this.h, ondcTicketConfiguration.h) && Intrinsics.d(this.i, ondcTicketConfiguration.i) && Intrinsics.d(this.j, ondcTicketConfiguration.j) && Intrinsics.d(this.k, ondcTicketConfiguration.k);
    }

    public final int hashCode() {
        int iE = (nf1.e(nf1.e(nf1.e(this.f6728a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31;
        Boolean bool = this.f;
        int iHashCode = (this.g.hashCode() + ((iE + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Integer num = this.h;
        return this.k.hashCode() + nf1.e((this.i.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcTicketConfiguration(id=", this.f6728a, ", name=", this.b, ", city=");
        cb0.t(sbE, this.c, ", agency=", this.d, ", isActive=");
        sbE.append(this.e);
        sbE.append(", isVisible=");
        sbE.append(this.f);
        sbE.append(", productValidationType=");
        sbE.append(this.g);
        sbE.append(", minAppVer=");
        sbE.append(this.h);
        sbE.append(", branding=");
        sbE.append(this.i);
        sbE.append(", productType=");
        sbE.append(this.j);
        sbE.append(", productSubType=");
        return vo1.p(sbE, this.k, ")");
    }

    public OndcTicketConfiguration(String id, String name, String city, String str, boolean z, Boolean bool, ProductValidationType productValidationType, Integer num, BrandingDetails brandingDetails, String productType, String productSubType) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(city, "city");
        Intrinsics.i(productValidationType, "productValidationType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f6728a = id;
        this.b = name;
        this.c = city;
        this.d = str;
        this.e = z;
        this.f = bool;
        this.g = productValidationType;
        this.h = num;
        this.i = brandingDetails;
        this.j = productType;
        this.k = productSubType;
    }
}
