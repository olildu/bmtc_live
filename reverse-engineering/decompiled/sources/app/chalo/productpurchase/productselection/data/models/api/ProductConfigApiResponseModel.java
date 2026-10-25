package app.chalo.productpurchase.productselection.data.models.api;

import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigSubCategorySelectionApiResponseModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.mx0;
import defpackage.nf1;
import defpackage.nx0;
import defpackage.pk0;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "", "Companion", "SuperPassConfigApiResponseModel", "QuickPayConfigApiResponseModel", "CardRechargeConfigApiResponseModel", "InstantTicketConfigurationApiModel", "GroupTicketConfigurationApiModel", "SingleJourneyTicketApiModel", "UnknownProductConfigApiResponseModel", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$GroupTicketConfigurationApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$InstantTicketConfigurationApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$QuickPayConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SingleJourneyTicketApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SuperPassConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = ProductConfigDeserializer.class)
public abstract class ProductConfigApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardRechargeConfigApiResponseModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new mx0(5))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8597a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final CardRechargeFareInfoApiResponseModel g;
        public final String h;
        public final Boolean i;
        public final Boolean j;
        public final Integer k;
        public final Integer l;
        public final BrandingApiModel m;
        public final List n;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardRechargeConfigApiResponseModel> serializer() {
                return ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer.f8598a;
            }
        }

        public CardRechargeConfigApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel, String str7, Boolean bool, Boolean bool2, Integer num, Integer num2, BrandingApiModel brandingApiModel, List list) {
            if (16383 != (i & 16383)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$CardRechargeConfigApiResponseModel$$serializer.f8598a.getDescriptor(), i, 16383);
                throw null;
            }
            this.f8597a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = cardRechargeFareInfoApiResponseModel;
            this.h = str7;
            this.i = bool;
            this.j = bool2;
            this.k = num;
            this.l = num2;
            this.m = brandingApiModel;
            this.n = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRechargeConfigApiResponseModel)) {
                return false;
            }
            CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel = (CardRechargeConfigApiResponseModel) obj;
            return Intrinsics.d(this.f8597a, cardRechargeConfigApiResponseModel.f8597a) && Intrinsics.d(this.b, cardRechargeConfigApiResponseModel.b) && Intrinsics.d(this.c, cardRechargeConfigApiResponseModel.c) && Intrinsics.d(this.d, cardRechargeConfigApiResponseModel.d) && Intrinsics.d(this.e, cardRechargeConfigApiResponseModel.e) && Intrinsics.d(this.f, cardRechargeConfigApiResponseModel.f) && Intrinsics.d(this.g, cardRechargeConfigApiResponseModel.g) && Intrinsics.d(this.h, cardRechargeConfigApiResponseModel.h) && Intrinsics.d(this.i, cardRechargeConfigApiResponseModel.i) && Intrinsics.d(this.j, cardRechargeConfigApiResponseModel.j) && Intrinsics.d(this.k, cardRechargeConfigApiResponseModel.k) && Intrinsics.d(this.l, cardRechargeConfigApiResponseModel.l) && Intrinsics.d(this.m, cardRechargeConfigApiResponseModel.m) && Intrinsics.d(this.n, cardRechargeConfigApiResponseModel.n);
        }

        public final int hashCode() {
            String str = this.f8597a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel = this.g;
            int iHashCode7 = (iHashCode6 + (cardRechargeFareInfoApiResponseModel == null ? 0 : cardRechargeFareInfoApiResponseModel.hashCode())) * 31;
            String str7 = this.h;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.i;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.j;
            int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num = this.k;
            int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.l;
            int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BrandingApiModel brandingApiModel = this.m;
            int iHashCode13 = (iHashCode12 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            List list = this.n;
            return iHashCode13 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("CardRechargeConfigApiResponseModel(id=", this.f8597a, ", city=", this.b, ", name=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            cb0.t(sbE, this.e, ", agency=", this.f, ", fareInfo=");
            sbE.append(this.g);
            sbE.append(", rechargeDelayCopy=");
            sbE.append(this.h);
            sbE.append(", isActive=");
            hq0.u(sbE, this.i, ", isVisible=", this.j, ", minAppVer=");
            pk0.y(sbE, this.k, ", maxAppVer=", this.l, ", branding=");
            sbE.append(this.m);
            sbE.append(", terms=");
            sbE.append(this.n);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigApiResponseModel> serializer() {
            return ProductConfigDeserializer.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$GroupTicketConfigurationApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GroupTicketConfigurationApiModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8599a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;
        public final Boolean f;
        public final BrandingApiModel g;
        public final String h;
        public final String i;
        public final Long j;
        public final Integer k;
        public final Integer l;
        public final List m;
        public final List n;
        public final List o;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$GroupTicketConfigurationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GroupTicketConfigurationApiModel> serializer() {
                return ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer.f8600a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            p = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(6)), LazyKt.a(lazyThreadSafetyMode, new mx0(7)), LazyKt.a(lazyThreadSafetyMode, new mx0(8))};
        }

        public GroupTicketConfigurationApiModel(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, BrandingApiModel brandingApiModel, String str5, String str6, Long l, Integer num, Integer num2, List list, List list2, List list3) {
            if (16383 != (i & 16383)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$GroupTicketConfigurationApiModel$$serializer.f8600a.getDescriptor(), i, 16383);
                throw null;
            }
            this.f8599a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
            this.f = bool2;
            this.g = brandingApiModel;
            this.h = str5;
            this.i = str6;
            this.j = l;
            this.k = num;
            this.l = num2;
            this.m = list;
            this.n = list2;
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = list3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketConfigurationApiModel)) {
                return false;
            }
            GroupTicketConfigurationApiModel groupTicketConfigurationApiModel = (GroupTicketConfigurationApiModel) obj;
            return Intrinsics.d(this.f8599a, groupTicketConfigurationApiModel.f8599a) && Intrinsics.d(this.b, groupTicketConfigurationApiModel.b) && Intrinsics.d(this.c, groupTicketConfigurationApiModel.c) && Intrinsics.d(this.d, groupTicketConfigurationApiModel.d) && Intrinsics.d(this.e, groupTicketConfigurationApiModel.e) && Intrinsics.d(this.f, groupTicketConfigurationApiModel.f) && Intrinsics.d(this.g, groupTicketConfigurationApiModel.g) && Intrinsics.d(this.h, groupTicketConfigurationApiModel.h) && Intrinsics.d(this.i, groupTicketConfigurationApiModel.i) && Intrinsics.d(this.j, groupTicketConfigurationApiModel.j) && Intrinsics.d(this.k, groupTicketConfigurationApiModel.k) && Intrinsics.d(this.l, groupTicketConfigurationApiModel.l) && Intrinsics.d(this.m, groupTicketConfigurationApiModel.m) && Intrinsics.d(this.n, groupTicketConfigurationApiModel.n) && Intrinsics.d(this.o, groupTicketConfigurationApiModel.o);
        }

        public final int hashCode() {
            String str = this.f8599a;
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
            BrandingApiModel brandingApiModel = this.g;
            int iHashCode7 = (iHashCode6 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            String str5 = this.h;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l = this.j;
            int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.k;
            int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.l;
            int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List list = this.m;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.n;
            int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.o;
            return iHashCode14 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("GroupTicketConfigurationApiModel(id=", this.f8599a, ", name=", this.b, ", city=");
            cb0.t(sbE, this.c, ", agency=", this.d, ", isActive=");
            hq0.u(sbE, this.e, ", isVisible=", this.f, ", branding=");
            sbE.append(this.g);
            sbE.append(", productType=");
            sbE.append(this.h);
            sbE.append(", productSubType=");
            cb0.r(this.j, this.i, ", activeDuration=", ", minAppVer=", sbE);
            pk0.y(sbE, this.k, ", maxAppVer=", this.l, ", imageUrls=");
            dd.o(sbE, this.m, ", terms=", this.n, ", eligibleSubProducts=");
            return xs.l(sbE, this.o, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$InstantTicketConfigurationApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InstantTicketConfigurationApiModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new mx0(9))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8601a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;
        public final BrandingApiModel f;
        public final String g;
        public final String h;
        public final InstantTicketFareInfoApiResponseModel i;
        public final Long j;
        public final Boolean k;
        public final Boolean l;
        public final List m;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$InstantTicketConfigurationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$InstantTicketConfigurationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InstantTicketConfigurationApiModel> serializer() {
                return ProductConfigApiResponseModel$InstantTicketConfigurationApiModel$$serializer.f8602a;
            }
        }

        public InstantTicketConfigurationApiModel(int i, String str, String str2, String str3, String str4, Boolean bool, BrandingApiModel brandingApiModel, String str5, String str6, InstantTicketFareInfoApiResponseModel instantTicketFareInfoApiResponseModel, Long l, Boolean bool2, Boolean bool3, List list) {
            if (8191 != (i & 8191)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$InstantTicketConfigurationApiModel$$serializer.f8602a.getDescriptor(), i, 8191);
                throw null;
            }
            this.f8601a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
            this.f = brandingApiModel;
            this.g = str5;
            this.h = str6;
            this.i = instantTicketFareInfoApiResponseModel;
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
            return Intrinsics.d(this.f8601a, instantTicketConfigurationApiModel.f8601a) && Intrinsics.d(this.b, instantTicketConfigurationApiModel.b) && Intrinsics.d(this.c, instantTicketConfigurationApiModel.c) && Intrinsics.d(this.d, instantTicketConfigurationApiModel.d) && Intrinsics.d(this.e, instantTicketConfigurationApiModel.e) && Intrinsics.d(this.f, instantTicketConfigurationApiModel.f) && Intrinsics.d(this.g, instantTicketConfigurationApiModel.g) && Intrinsics.d(this.h, instantTicketConfigurationApiModel.h) && Intrinsics.d(this.i, instantTicketConfigurationApiModel.i) && Intrinsics.d(this.j, instantTicketConfigurationApiModel.j) && Intrinsics.d(this.k, instantTicketConfigurationApiModel.k) && Intrinsics.d(this.l, instantTicketConfigurationApiModel.l) && Intrinsics.d(this.m, instantTicketConfigurationApiModel.m);
        }

        public final int hashCode() {
            String str = this.f8601a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.e;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            BrandingApiModel brandingApiModel = this.f;
            int iHashCode6 = (iHashCode5 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            String str5 = this.g;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            InstantTicketFareInfoApiResponseModel instantTicketFareInfoApiResponseModel = this.i;
            int iHashCode9 = (iHashCode8 + (instantTicketFareInfoApiResponseModel == null ? 0 : instantTicketFareInfoApiResponseModel.hashCode())) * 31;
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
            StringBuilder sbE = dd.e("InstantTicketConfigurationApiModel(id=", this.f8601a, ", name=", this.b, ", city=");
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
            hq0.u(sbE, this.k, ", showFindMyFare=", this.l, ", imageUrls=");
            return xs.l(sbE, this.m, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$QuickPayConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QuickPayConfigApiResponseModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8603a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Long g;
        public final Boolean h;
        public final Integer i;
        public final Integer j;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$QuickPayConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$QuickPayConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QuickPayConfigApiResponseModel> serializer() {
                return ProductConfigApiResponseModel$QuickPayConfigApiResponseModel$$serializer.f8604a;
            }
        }

        public QuickPayConfigApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, Boolean bool, Integer num, Integer num2) {
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$QuickPayConfigApiResponseModel$$serializer.f8604a.getDescriptor(), i, 1023);
                throw null;
            }
            this.f8603a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = l;
            this.h = bool;
            this.i = num;
            this.j = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayConfigApiResponseModel)) {
                return false;
            }
            QuickPayConfigApiResponseModel quickPayConfigApiResponseModel = (QuickPayConfigApiResponseModel) obj;
            return Intrinsics.d(this.f8603a, quickPayConfigApiResponseModel.f8603a) && Intrinsics.d(this.b, quickPayConfigApiResponseModel.b) && Intrinsics.d(this.c, quickPayConfigApiResponseModel.c) && Intrinsics.d(this.d, quickPayConfigApiResponseModel.d) && Intrinsics.d(this.e, quickPayConfigApiResponseModel.e) && Intrinsics.d(this.f, quickPayConfigApiResponseModel.f) && Intrinsics.d(this.g, quickPayConfigApiResponseModel.g) && Intrinsics.d(this.h, quickPayConfigApiResponseModel.h) && Intrinsics.d(this.i, quickPayConfigApiResponseModel.i) && Intrinsics.d(this.j, quickPayConfigApiResponseModel.j);
        }

        public final int hashCode() {
            String str = this.f8603a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l = this.g;
            int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.i;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.j;
            return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("QuickPayConfigApiResponseModel(id=", this.f8603a, ", city=", this.b, ", name=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            cb0.t(sbE, this.e, ", agency=", this.f, ", activeDuration=");
            sbE.append(this.g);
            sbE.append(", isActive=");
            sbE.append(this.h);
            sbE.append(", minAppVer=");
            sbE.append(this.i);
            sbE.append(", maxAppVer=");
            sbE.append(this.j);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SingleJourneyTicketApiModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SingleJourneyTicketApiModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] D;
        public final Boolean A;
        public final Integer B;
        public final Integer C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8605a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Integer i;
        public final String j;
        public final String k;
        public final String l;
        public final BrandingApiModel m;
        public final List n;
        public final Long o;
        public final Long p;
        public final List q;
        public final UnknownProductSubCategorySelectionApiResponseModel r;
        public final List s;
        public final Map t;
        public final Map u;
        public final List v;
        public final List w;
        public final Boolean x;
        public final String y;
        public final Boolean z;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SingleJourneyTicketApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SingleJourneyTicketApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SingleJourneyTicketApiModel> serializer() {
                return ProductConfigApiResponseModel$SingleJourneyTicketApiModel$$serializer.f8606a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            D = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(10)), null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(11)), null, LazyKt.a(lazyThreadSafetyMode, new mx0(12)), LazyKt.a(lazyThreadSafetyMode, new mx0(13)), LazyKt.a(lazyThreadSafetyMode, new mx0(14)), LazyKt.a(lazyThreadSafetyMode, new mx0(15)), LazyKt.a(lazyThreadSafetyMode, new mx0(16)), null, null, null, null, null, null};
        }

        public SingleJourneyTicketApiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, BrandingApiModel brandingApiModel, List list, Long l, Long l2, List list2, UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel, List list3, Map map, Map map2, List list4, List list5, Boolean bool, String str12, Boolean bool2, Boolean bool3, Integer num2, Integer num3) {
            if (536870911 != (i & 536870911)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$SingleJourneyTicketApiModel$$serializer.f8606a.getDescriptor(), i, 536870911);
                throw null;
            }
            this.f8605a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = num;
            this.j = str9;
            this.k = str10;
            this.l = str11;
            this.m = brandingApiModel;
            this.n = list;
            this.o = l;
            this.p = l2;
            this.q = list2;
            this.r = unknownProductSubCategorySelectionApiResponseModel;
            this.s = list3;
            this.t = map;
            this.u = map2;
            this.v = list4;
            this.w = list5;
            this.x = bool;
            this.y = str12;
            this.z = bool2;
            this.A = bool3;
            this.B = num2;
            this.C = num3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleJourneyTicketApiModel)) {
                return false;
            }
            SingleJourneyTicketApiModel singleJourneyTicketApiModel = (SingleJourneyTicketApiModel) obj;
            return Intrinsics.d(this.f8605a, singleJourneyTicketApiModel.f8605a) && Intrinsics.d(this.b, singleJourneyTicketApiModel.b) && Intrinsics.d(this.c, singleJourneyTicketApiModel.c) && Intrinsics.d(this.d, singleJourneyTicketApiModel.d) && Intrinsics.d(this.e, singleJourneyTicketApiModel.e) && Intrinsics.d(this.f, singleJourneyTicketApiModel.f) && Intrinsics.d(this.g, singleJourneyTicketApiModel.g) && Intrinsics.d(this.h, singleJourneyTicketApiModel.h) && Intrinsics.d(this.i, singleJourneyTicketApiModel.i) && Intrinsics.d(this.j, singleJourneyTicketApiModel.j) && Intrinsics.d(this.k, singleJourneyTicketApiModel.k) && Intrinsics.d(this.l, singleJourneyTicketApiModel.l) && Intrinsics.d(this.m, singleJourneyTicketApiModel.m) && Intrinsics.d(this.n, singleJourneyTicketApiModel.n) && Intrinsics.d(this.o, singleJourneyTicketApiModel.o) && Intrinsics.d(this.p, singleJourneyTicketApiModel.p) && Intrinsics.d(this.q, singleJourneyTicketApiModel.q) && Intrinsics.d(this.r, singleJourneyTicketApiModel.r) && Intrinsics.d(this.s, singleJourneyTicketApiModel.s) && Intrinsics.d(this.t, singleJourneyTicketApiModel.t) && Intrinsics.d(this.u, singleJourneyTicketApiModel.u) && Intrinsics.d(this.v, singleJourneyTicketApiModel.v) && Intrinsics.d(this.w, singleJourneyTicketApiModel.w) && Intrinsics.d(this.x, singleJourneyTicketApiModel.x) && Intrinsics.d(this.y, singleJourneyTicketApiModel.y) && Intrinsics.d(this.z, singleJourneyTicketApiModel.z) && Intrinsics.d(this.A, singleJourneyTicketApiModel.A) && Intrinsics.d(this.B, singleJourneyTicketApiModel.B) && Intrinsics.d(this.C, singleJourneyTicketApiModel.C);
        }

        public final int hashCode() {
            String str = this.f8605a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num = this.i;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            String str9 = this.j;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.k;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.l;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            BrandingApiModel brandingApiModel = this.m;
            int iHashCode13 = (iHashCode12 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            List list = this.n;
            int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
            Long l = this.o;
            int iHashCode15 = (iHashCode14 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.p;
            int iHashCode16 = (iHashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
            List list2 = this.q;
            int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
            UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel = this.r;
            int iHashCode18 = (iHashCode17 + (unknownProductSubCategorySelectionApiResponseModel == null ? 0 : unknownProductSubCategorySelectionApiResponseModel.hashCode())) * 31;
            List list3 = this.s;
            int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Map map = this.t;
            int iHashCode20 = (iHashCode19 + (map == null ? 0 : map.hashCode())) * 31;
            Map map2 = this.u;
            int iHashCode21 = (iHashCode20 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List list4 = this.v;
            int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List list5 = this.w;
            int iHashCode23 = (iHashCode22 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool = this.x;
            int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str12 = this.y;
            int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Boolean bool2 = this.z;
            int iHashCode26 = (iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.A;
            int iHashCode27 = (iHashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num2 = this.B;
            int iHashCode28 = (iHashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.C;
            return iHashCode28 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SingleJourneyTicketApiModel(id=", this.f8605a, ", city=", this.b, ", displayName=");
            cb0.t(sbE, this.c, ", name=", this.d, ", desc=");
            cb0.t(sbE, this.e, ", icon=", this.f, ", label=");
            cb0.t(sbE, this.g, ", addInfo=", this.h, ", priority=");
            gf.w(this.i, ", productType=", this.j, ", productSubType=", sbE);
            cb0.t(sbE, this.k, ", agency=", this.l, ", branding=");
            sbE.append(this.m);
            sbE.append(", imageUrls=");
            sbE.append(this.n);
            sbE.append(", validity=");
            nf1.w(sbE, this.o, ", activeDuration=", this.p, ", subCategory=");
            sbE.append(this.q);
            sbE.append(", subCategorySelection=");
            sbE.append(this.r);
            sbE.append(", categories=");
            sbE.append(this.s);
            sbE.append(", validDurations=");
            sbE.append(this.t);
            sbE.append(", fareMapping=");
            sbE.append(this.u);
            sbE.append(", terms=");
            sbE.append(this.v);
            sbE.append(", serviceType=");
            sbE.append(this.w);
            sbE.append(", isActive=");
            sbE.append(this.x);
            sbE.append(", inactiveReason=");
            gf.v(this.z, this.y, ", isVisible=", ", shouldHideSubCategorySelection=", sbE);
            sbE.append(this.A);
            sbE.append(", minAppVer=");
            sbE.append(this.B);
            sbE.append(", maxAppVer=");
            return pk0.k(sbE, this.C, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SuperPassConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SuperPassConfigApiResponseModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] D;
        public final Boolean A;
        public final List B;
        public final List C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8607a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Long g;
        public final List h;
        public final Map i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Integer n;
        public final Boolean o;
        public final String p;
        public final Boolean q;
        public final Boolean r;
        public final Integer s;
        public final Integer t;
        public final BrandingApiModel u;
        public final List v;
        public final ProductConfigSubCategorySelectionApiResponseModel w;
        public final List x;
        public final List y;
        public final List z;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$SuperPassConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SuperPassConfigApiResponseModel> serializer() {
                return ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer.f8608a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            D = new Lazy[]{null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(17)), LazyKt.a(lazyThreadSafetyMode, new mx0(18)), null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(19)), null, LazyKt.a(lazyThreadSafetyMode, new mx0(20)), LazyKt.a(lazyThreadSafetyMode, new mx0(21)), LazyKt.a(lazyThreadSafetyMode, new mx0(22)), null, LazyKt.a(lazyThreadSafetyMode, new mx0(23)), LazyKt.a(lazyThreadSafetyMode, new mx0(24))};
        }

        public SuperPassConfigApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, List list, Map map, String str7, String str8, String str9, String str10, Integer num, Boolean bool, String str11, Boolean bool2, Boolean bool3, Integer num2, Integer num3, BrandingApiModel brandingApiModel, List list2, ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel, List list3, List list4, List list5, Boolean bool4, List list6, List list7) {
            if (268435455 != (i & 268435455)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$SuperPassConfigApiResponseModel$$serializer.f8608a.getDescriptor(), i, 268435455);
                throw null;
            }
            this.f8607a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = l;
            this.h = list;
            this.i = map;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = num;
            this.o = bool;
            this.p = str11;
            this.q = bool2;
            this.r = bool3;
            this.s = num2;
            this.t = num3;
            this.u = brandingApiModel;
            this.v = list2;
            this.w = productConfigSubCategorySelectionApiResponseModel;
            this.x = list3;
            this.y = list4;
            this.z = list5;
            this.A = bool4;
            this.B = list6;
            if ((i & 268435456) == 0) {
                this.C = null;
            } else {
                this.C = list7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassConfigApiResponseModel)) {
                return false;
            }
            SuperPassConfigApiResponseModel superPassConfigApiResponseModel = (SuperPassConfigApiResponseModel) obj;
            return Intrinsics.d(this.f8607a, superPassConfigApiResponseModel.f8607a) && Intrinsics.d(this.b, superPassConfigApiResponseModel.b) && Intrinsics.d(this.c, superPassConfigApiResponseModel.c) && Intrinsics.d(this.d, superPassConfigApiResponseModel.d) && Intrinsics.d(this.e, superPassConfigApiResponseModel.e) && Intrinsics.d(this.f, superPassConfigApiResponseModel.f) && Intrinsics.d(this.g, superPassConfigApiResponseModel.g) && Intrinsics.d(this.h, superPassConfigApiResponseModel.h) && Intrinsics.d(this.i, superPassConfigApiResponseModel.i) && Intrinsics.d(this.j, superPassConfigApiResponseModel.j) && Intrinsics.d(this.k, superPassConfigApiResponseModel.k) && Intrinsics.d(this.l, superPassConfigApiResponseModel.l) && Intrinsics.d(this.m, superPassConfigApiResponseModel.m) && Intrinsics.d(this.n, superPassConfigApiResponseModel.n) && Intrinsics.d(this.o, superPassConfigApiResponseModel.o) && Intrinsics.d(this.p, superPassConfigApiResponseModel.p) && Intrinsics.d(this.q, superPassConfigApiResponseModel.q) && Intrinsics.d(this.r, superPassConfigApiResponseModel.r) && Intrinsics.d(this.s, superPassConfigApiResponseModel.s) && Intrinsics.d(this.t, superPassConfigApiResponseModel.t) && Intrinsics.d(this.u, superPassConfigApiResponseModel.u) && Intrinsics.d(this.v, superPassConfigApiResponseModel.v) && Intrinsics.d(this.w, superPassConfigApiResponseModel.w) && Intrinsics.d(this.x, superPassConfigApiResponseModel.x) && Intrinsics.d(this.y, superPassConfigApiResponseModel.y) && Intrinsics.d(this.z, superPassConfigApiResponseModel.z) && Intrinsics.d(this.A, superPassConfigApiResponseModel.A) && Intrinsics.d(this.B, superPassConfigApiResponseModel.B) && Intrinsics.d(this.C, superPassConfigApiResponseModel.C);
        }

        public final int hashCode() {
            String str = this.f8607a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l = this.g;
            int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
            List list = this.h;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            Map map = this.i;
            int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.j;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.k;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.l;
            int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.m;
            int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num = this.n;
            int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.o;
            int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str11 = this.p;
            int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool2 = this.q;
            int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.r;
            int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num2 = this.s;
            int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.t;
            int iHashCode20 = (iHashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
            BrandingApiModel brandingApiModel = this.u;
            int iHashCode21 = (iHashCode20 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            List list2 = this.v;
            int iHashCode22 = (iHashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel = this.w;
            int iHashCode23 = (iHashCode22 + (productConfigSubCategorySelectionApiResponseModel == null ? 0 : productConfigSubCategorySelectionApiResponseModel.hashCode())) * 31;
            List list3 = this.x;
            int iHashCode24 = (iHashCode23 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.y;
            int iHashCode25 = (iHashCode24 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List list5 = this.z;
            int iHashCode26 = (iHashCode25 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool4 = this.A;
            int iHashCode27 = (iHashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            List list6 = this.B;
            int iHashCode28 = (iHashCode27 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List list7 = this.C;
            return iHashCode28 + (list7 != null ? list7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SuperPassConfigApiResponseModel(productSubType=", this.f8607a, ", id=", this.b, ", city=");
            cb0.t(sbE, this.c, ", name=", this.d, ", productType=");
            cb0.t(sbE, this.e, ", agency=", this.f, ", activeDuration=");
            sbE.append(this.g);
            sbE.append(", categories=");
            sbE.append(this.h);
            sbE.append(", fareMapping=");
            sbE.append(this.i);
            sbE.append(", desc=");
            sbE.append(this.j);
            sbE.append(", productIcon=");
            cb0.t(sbE, this.k, ", label=", this.l, ", additionalInfo=");
            xs.u(this.n, this.m, ", priority=", ", isActive=", sbE);
            hq0.t(this.o, ", inactiveReason=", this.p, ", isVisible=", sbE);
            hq0.u(sbE, this.q, ", hideSubCategorySelection=", this.r, ", minAppVer=");
            pk0.y(sbE, this.s, ", maxAppVer=", this.t, ", branding=");
            sbE.append(this.u);
            sbE.append(", subCategory=");
            sbE.append(this.v);
            sbE.append(", subCategorySelection=");
            sbE.append(this.w);
            sbE.append(", terms=");
            sbE.append(this.x);
            sbE.append(", highlightedTnc=");
            dd.o(sbE, this.y, ", serviceType=", this.z, ", isStopBasedPass=");
            sbE.append(this.A);
            sbE.append(", imageUrls=");
            sbE.append(this.B);
            sbE.append(", applicableRules=");
            return xs.l(sbE, this.C, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UnknownProductConfigApiResponseModel extends ProductConfigApiResponseModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] E;
        public final Integer A;
        public final Integer B;
        public final Boolean C;
        public final List D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8609a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Integer i;
        public final String j;
        public final String k;
        public final String l;
        public final BrandingApiModel m;
        public final Long n;
        public final Long o;
        public final List p;
        public final UnknownProductSubCategorySelectionApiResponseModel q;
        public final List r;
        public final Map s;
        public final Map t;
        public final List u;
        public final List v;
        public final Boolean w;
        public final String x;
        public final Boolean y;
        public final Boolean z;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UnknownProductConfigApiResponseModel> serializer() {
                return ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel$$serializer.f8610a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            E = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new mx0(25)), null, LazyKt.a(lazyThreadSafetyMode, new mx0(26)), LazyKt.a(lazyThreadSafetyMode, new mx0(27)), LazyKt.a(lazyThreadSafetyMode, new mx0(28)), LazyKt.a(lazyThreadSafetyMode, new mx0(29)), LazyKt.a(lazyThreadSafetyMode, new nx0(0)), null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nx0(1))};
        }

        public UnknownProductConfigApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, BrandingApiModel brandingApiModel, Long l, Long l2, List list, UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel, List list2, Map map, Map map2, List list3, List list4, Boolean bool, String str12, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Boolean bool4, List list5) {
            if (1073741823 != (i & 1073741823)) {
                PluginExceptionsKt.b(ProductConfigApiResponseModel$UnknownProductConfigApiResponseModel$$serializer.f8610a.getDescriptor(), i, 1073741823);
                throw null;
            }
            this.f8609a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = num;
            this.j = str9;
            this.k = str10;
            this.l = str11;
            this.m = brandingApiModel;
            this.n = l;
            this.o = l2;
            this.p = list;
            this.q = unknownProductSubCategorySelectionApiResponseModel;
            this.r = list2;
            this.s = map;
            this.t = map2;
            this.u = list3;
            this.v = list4;
            this.w = bool;
            this.x = str12;
            this.y = bool2;
            this.z = bool3;
            this.A = num2;
            this.B = num3;
            this.C = bool4;
            this.D = list5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownProductConfigApiResponseModel)) {
                return false;
            }
            UnknownProductConfigApiResponseModel unknownProductConfigApiResponseModel = (UnknownProductConfigApiResponseModel) obj;
            return Intrinsics.d(this.f8609a, unknownProductConfigApiResponseModel.f8609a) && Intrinsics.d(this.b, unknownProductConfigApiResponseModel.b) && Intrinsics.d(this.c, unknownProductConfigApiResponseModel.c) && Intrinsics.d(this.d, unknownProductConfigApiResponseModel.d) && Intrinsics.d(this.e, unknownProductConfigApiResponseModel.e) && Intrinsics.d(this.f, unknownProductConfigApiResponseModel.f) && Intrinsics.d(this.g, unknownProductConfigApiResponseModel.g) && Intrinsics.d(this.h, unknownProductConfigApiResponseModel.h) && Intrinsics.d(this.i, unknownProductConfigApiResponseModel.i) && Intrinsics.d(this.j, unknownProductConfigApiResponseModel.j) && Intrinsics.d(this.k, unknownProductConfigApiResponseModel.k) && Intrinsics.d(this.l, unknownProductConfigApiResponseModel.l) && Intrinsics.d(this.m, unknownProductConfigApiResponseModel.m) && Intrinsics.d(this.n, unknownProductConfigApiResponseModel.n) && Intrinsics.d(this.o, unknownProductConfigApiResponseModel.o) && Intrinsics.d(this.p, unknownProductConfigApiResponseModel.p) && Intrinsics.d(this.q, unknownProductConfigApiResponseModel.q) && Intrinsics.d(this.r, unknownProductConfigApiResponseModel.r) && Intrinsics.d(this.s, unknownProductConfigApiResponseModel.s) && Intrinsics.d(this.t, unknownProductConfigApiResponseModel.t) && Intrinsics.d(this.u, unknownProductConfigApiResponseModel.u) && Intrinsics.d(this.v, unknownProductConfigApiResponseModel.v) && Intrinsics.d(this.w, unknownProductConfigApiResponseModel.w) && Intrinsics.d(this.x, unknownProductConfigApiResponseModel.x) && Intrinsics.d(this.y, unknownProductConfigApiResponseModel.y) && Intrinsics.d(this.z, unknownProductConfigApiResponseModel.z) && Intrinsics.d(this.A, unknownProductConfigApiResponseModel.A) && Intrinsics.d(this.B, unknownProductConfigApiResponseModel.B) && Intrinsics.d(this.C, unknownProductConfigApiResponseModel.C) && Intrinsics.d(this.D, unknownProductConfigApiResponseModel.D);
        }

        public final int hashCode() {
            String str = this.f8609a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num = this.i;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            String str9 = this.j;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.k;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.l;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            BrandingApiModel brandingApiModel = this.m;
            int iHashCode13 = (iHashCode12 + (brandingApiModel == null ? 0 : brandingApiModel.hashCode())) * 31;
            Long l = this.n;
            int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.o;
            int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
            List list = this.p;
            int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
            UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel = this.q;
            int iHashCode17 = (iHashCode16 + (unknownProductSubCategorySelectionApiResponseModel == null ? 0 : unknownProductSubCategorySelectionApiResponseModel.hashCode())) * 31;
            List list2 = this.r;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Map map = this.s;
            int iHashCode19 = (iHashCode18 + (map == null ? 0 : map.hashCode())) * 31;
            Map map2 = this.t;
            int iHashCode20 = (iHashCode19 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List list3 = this.u;
            int iHashCode21 = (iHashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.v;
            int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool = this.w;
            int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str12 = this.x;
            int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Boolean bool2 = this.y;
            int iHashCode25 = (iHashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.z;
            int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num2 = this.A;
            int iHashCode27 = (iHashCode26 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.B;
            int iHashCode28 = (iHashCode27 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool4 = this.C;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            List list5 = this.D;
            return iHashCode29 + (list5 != null ? list5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("UnknownProductConfigApiResponseModel(id=", this.f8609a, ", city=", this.b, ", displayName=");
            cb0.t(sbE, this.c, ", name=", this.d, ", desc=");
            cb0.t(sbE, this.e, ", icon=", this.f, ", label=");
            cb0.t(sbE, this.g, ", additionalInfo=", this.h, ", priority=");
            gf.w(this.i, ", productType=", this.j, ", productSubType=", sbE);
            cb0.t(sbE, this.k, ", agency=", this.l, ", productBranding=");
            sbE.append(this.m);
            sbE.append(", validity=");
            sbE.append(this.n);
            sbE.append(", activeDuration=");
            sbE.append(this.o);
            sbE.append(", subCategory=");
            sbE.append(this.p);
            sbE.append(", subCategorySelection=");
            sbE.append(this.q);
            sbE.append(", categories=");
            sbE.append(this.r);
            sbE.append(", validDurations=");
            sbE.append(this.s);
            sbE.append(", fareMapping=");
            sbE.append(this.t);
            sbE.append(", terms=");
            dd.o(sbE, this.u, ", serviceType=", this.v, ", isActive=");
            hq0.t(this.w, ", inactiveReason=", this.x, ", isVisible=", sbE);
            hq0.u(sbE, this.y, ", shouldHideSubCategorySelection=", this.z, ", minAppVer=");
            pk0.y(sbE, this.A, ", maxAppVer=", this.B, ", isStopBasedPass=");
            sbE.append(this.C);
            sbE.append(", imageUrls=");
            sbE.append(this.D);
            sbE.append(")");
            return sbE.toString();
        }
    }
}
