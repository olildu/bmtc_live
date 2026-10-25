package app.chalo.instantticket.config.models;

import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.mappers.ProductBookingCommonApiToAppModelsMappersKt;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.ea0;
import defpackage.nf1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/config/models/InstantTicketConfiguration;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ea0(8))};
    public static final InstantTicketConfiguration o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3831a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final BrandingDetails f;
    public final String g;
    public final String h;
    public final FareInfo i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final List m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/config/models/InstantTicketConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/config/models/InstantTicketConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketConfiguration> serializer() {
            return InstantTicketConfiguration$$serializer.f3832a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.EmptyList] */
    static {
        ?? arrayList;
        InstantTicketConfigurationApiModel.INSTANCE.getClass();
        InstantTicketConfigurationApiModel instantTicketConfigurationApiModel = InstantTicketConfigurationApiModel.o;
        Intrinsics.i(instantTicketConfigurationApiModel, "<this>");
        String str = instantTicketConfigurationApiModel.f3833a;
        String str2 = str == null ? "" : str;
        String str3 = instantTicketConfigurationApiModel.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = instantTicketConfigurationApiModel.c;
        String str6 = str5 == null ? "" : str5;
        String str7 = instantTicketConfigurationApiModel.d;
        String str8 = str7 == null ? "" : str7;
        Boolean bool = instantTicketConfigurationApiModel.e;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        BrandingDetails brandingDetails = instantTicketConfigurationApiModel.f;
        if (brandingDetails == null) {
            brandingDetails = new BrandingDetails(false);
        }
        BrandingDetails brandingDetails2 = brandingDetails;
        String str9 = instantTicketConfigurationApiModel.g;
        String str10 = str9 == null ? "" : str9;
        String str11 = instantTicketConfigurationApiModel.h;
        String str12 = str11 == null ? "" : str11;
        FareInfo fareInfo = instantTicketConfigurationApiModel.i;
        if (fareInfo == null) {
            fareInfo = new FareInfo(0L, 0L);
        }
        Long l = instantTicketConfigurationApiModel.j;
        long jLongValue = l != null ? l.longValue() : 0L;
        Boolean bool2 = instantTicketConfigurationApiModel.k;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = instantTicketConfigurationApiModel.l;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        List list = instantTicketConfigurationApiModel.m;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductImageAppModel productImageAppModelB = ProductBookingCommonApiToAppModelsMappersKt.b((ProductImageApiResponseModel) it.next());
                if (productImageAppModelB != null) {
                    arrayList.add(productImageAppModelB);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        InstantTicketConfiguration instantTicketConfiguration = new InstantTicketConfiguration(str2, str4, str6, str8, zBooleanValue, brandingDetails2, str10, str12, fareInfo, jLongValue, zBooleanValue2, zBooleanValue3, arrayList);
        o = instantTicketConfiguration;
        ChaloJson chaloJson = ChaloJson.f6455a;
        Json json = ChaloJson.b;
        json.getClass();
        json.a(INSTANCE.serializer(), instantTicketConfiguration);
    }

    public /* synthetic */ InstantTicketConfiguration(int i, String str, String str2, String str3, String str4, boolean z, BrandingDetails brandingDetails, String str5, String str6, FareInfo fareInfo, long j, boolean z2, boolean z3, List list) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.b(InstantTicketConfiguration$$serializer.f3832a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f3831a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = brandingDetails;
        this.g = str5;
        this.h = str6;
        this.i = fareInfo;
        this.j = j;
        this.k = z2;
        this.l = z3;
        this.m = list;
    }

    public final String a() {
        Object next;
        String str;
        Iterator it = this.m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProductImageAppModel) next).b != ProductImageType.AGENCY_BRANDING_URL);
        ProductImageAppModel productImageAppModel = (ProductImageAppModel) next;
        if (productImageAppModel == null || (str = productImageAppModel.f8224a) == null || StringsKt.F(str)) {
            return null;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketConfiguration)) {
            return false;
        }
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) obj;
        return Intrinsics.d(this.f3831a, instantTicketConfiguration.f3831a) && Intrinsics.d(this.b, instantTicketConfiguration.b) && Intrinsics.d(this.c, instantTicketConfiguration.c) && Intrinsics.d(this.d, instantTicketConfiguration.d) && this.e == instantTicketConfiguration.e && Intrinsics.d(this.f, instantTicketConfiguration.f) && Intrinsics.d(this.g, instantTicketConfiguration.g) && Intrinsics.d(this.h, instantTicketConfiguration.h) && Intrinsics.d(this.i, instantTicketConfiguration.i) && this.j == instantTicketConfiguration.j && this.k == instantTicketConfiguration.k && this.l == instantTicketConfiguration.l && Intrinsics.d(this.m, instantTicketConfiguration.m);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + nf1.e(nf1.e((this.f.hashCode() + ((nf1.e(nf1.e(nf1.e(this.f3831a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31)) * 31, 31, this.g), 31, this.h)) * 31;
        long j = this.j;
        return this.m.hashCode() + ((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketConfiguration(id=", this.f3831a, ", name=", this.b, ", city=");
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
        sbE.append(this.k);
        sbE.append(", showFindMyFare=");
        sbE.append(this.l);
        sbE.append(", productImageUrls=");
        sbE.append(this.m);
        sbE.append(")");
        return sbE.toString();
    }

    public InstantTicketConfiguration(String id, String name, String city, String agency, boolean z, BrandingDetails branding, String productType, String productSubType, FareInfo fareInfo, long j, boolean z2, boolean z3, List productImageUrls) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(city, "city");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(branding, "branding");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productImageUrls, "productImageUrls");
        this.f3831a = id;
        this.b = name;
        this.c = city;
        this.d = agency;
        this.e = z;
        this.f = branding;
        this.g = productType;
        this.h = productSubType;
        this.i = fareInfo;
        this.j = j;
        this.k = z2;
        this.l = z3;
        this.m = productImageUrls;
    }
}
