package app.chalo.productpurchase.productselection.data.models.app;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "", "SuperPassConfigAppModel", "QuickPayConfigResponseAppModel", "CardRechargeConfigResponseAppModel", "InstantTicketConfigResponseAppModel", "GroupTicketConfigResponseAppModel", "SingleJourneyTicketAppModel", "UnknownProductConfigApiResponseModel", "Companion", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$CardRechargeConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$GroupTicketConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$InstantTicketConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$QuickPayConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$SingleJourneyTicketAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$SuperPassConfigAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$UnknownProductConfigApiResponseModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductConfigResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8638a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$CardRechargeConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardRechargeConfigResponseAppModel extends ProductConfigResponseAppModel {
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final boolean p;
        public final boolean q;
        public final CardRechargeFareInfoResponseAppModel r;
        public final String s;
        public final int t;
        public final int u;
        public final BrandingDetails v;
        public final List w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardRechargeConfigResponseAppModel(String id, String productType, String productSubType, String str, String agency, String city, boolean z, boolean z2, CardRechargeFareInfoResponseAppModel cardRechargeFareInfoResponseAppModel, String str2, int i, int i2, BrandingDetails brandingDetails, List terms) {
            super(id, productType, str, agency, z, z2, 1000, i, i2);
            Intrinsics.i(id, "id");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(city, "city");
            Intrinsics.i(terms, "terms");
            this.j = id;
            this.k = productType;
            this.l = productSubType;
            this.m = str;
            this.n = agency;
            this.o = city;
            this.p = z;
            this.q = z2;
            this.r = cardRechargeFareInfoResponseAppModel;
            this.s = str2;
            this.t = i;
            this.u = i2;
            this.v = brandingDetails;
            this.w = terms;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.n;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.u;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.t;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRechargeConfigResponseAppModel)) {
                return false;
            }
            CardRechargeConfigResponseAppModel cardRechargeConfigResponseAppModel = (CardRechargeConfigResponseAppModel) obj;
            return Intrinsics.d(this.j, cardRechargeConfigResponseAppModel.j) && Intrinsics.d(this.k, cardRechargeConfigResponseAppModel.k) && Intrinsics.d(this.l, cardRechargeConfigResponseAppModel.l) && Intrinsics.d(this.m, cardRechargeConfigResponseAppModel.m) && Intrinsics.d(this.n, cardRechargeConfigResponseAppModel.n) && Intrinsics.d(this.o, cardRechargeConfigResponseAppModel.o) && this.p == cardRechargeConfigResponseAppModel.p && this.q == cardRechargeConfigResponseAppModel.q && Intrinsics.d(this.r, cardRechargeConfigResponseAppModel.r) && Intrinsics.d(this.s, cardRechargeConfigResponseAppModel.s) && this.t == cardRechargeConfigResponseAppModel.t && this.u == cardRechargeConfigResponseAppModel.u && Intrinsics.d(this.v, cardRechargeConfigResponseAppModel.v) && Intrinsics.d(this.w, cardRechargeConfigResponseAppModel.w);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.k;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.p;
        }

        public final int hashCode() {
            int iHashCode = (this.r.hashCode() + ((((nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31)) * 31;
            String str = this.s;
            return this.w.hashCode() + ((this.v.hashCode() + ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.t) * 31) + this.u) * 31)) * 31);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getF() {
            return this.q;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("CardRechargeConfigResponseAppModel(id=", this.j, ", productType=", this.k, ", productSubType=");
            cb0.t(sbE, this.l, ", name=", this.m, ", agency=");
            cb0.t(sbE, this.n, ", city=", this.o, ", isActive=");
            z40.r(sbE, this.p, ", isVisible=", this.q, ", fareInfo=");
            sbE.append(this.r);
            sbE.append(", rechargeDelayCopy=");
            sbE.append(this.s);
            sbE.append(", minAppVer=");
            hq0.p(this.t, this.u, ", maxAppVer=", ", branding=", sbE);
            sbE.append(this.v);
            sbE.append(", terms=");
            sbE.append(this.w);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$Companion;", "", "", "DEFAULT_PRODUCT_PRIORITY", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$GroupTicketConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupTicketConfigResponseAppModel extends ProductConfigResponseAppModel {
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final boolean n;
        public final boolean o;
        public final BrandingDetails p;
        public final String q;
        public final String r;
        public final long s;
        public final int t;
        public final int u;
        public final List v;
        public final List w;
        public final List x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupTicketConfigResponseAppModel(String id, String name, String city, String agency, boolean z, boolean z2, BrandingDetails brandingDetails, String productType, String productSubType, long j, int i, int i2, List list, List terms, List eligibleSubProducts) {
            super(id, productType, name, agency, z, z2, 1000, i, i2);
            Intrinsics.i(id, "id");
            Intrinsics.i(name, "name");
            Intrinsics.i(city, "city");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(terms, "terms");
            Intrinsics.i(eligibleSubProducts, "eligibleSubProducts");
            this.j = id;
            this.k = name;
            this.l = city;
            this.m = agency;
            this.n = z;
            this.o = z2;
            this.p = brandingDetails;
            this.q = productType;
            this.r = productSubType;
            this.s = j;
            this.t = i;
            this.u = i2;
            this.v = list;
            this.w = terms;
            this.x = eligibleSubProducts;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.m;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.u;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.t;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketConfigResponseAppModel)) {
                return false;
            }
            GroupTicketConfigResponseAppModel groupTicketConfigResponseAppModel = (GroupTicketConfigResponseAppModel) obj;
            return Intrinsics.d(this.j, groupTicketConfigResponseAppModel.j) && Intrinsics.d(this.k, groupTicketConfigResponseAppModel.k) && Intrinsics.d(this.l, groupTicketConfigResponseAppModel.l) && Intrinsics.d(this.m, groupTicketConfigResponseAppModel.m) && this.n == groupTicketConfigResponseAppModel.n && this.o == groupTicketConfigResponseAppModel.o && Intrinsics.d(this.p, groupTicketConfigResponseAppModel.p) && Intrinsics.d(this.q, groupTicketConfigResponseAppModel.q) && Intrinsics.d(this.r, groupTicketConfigResponseAppModel.r) && this.s == groupTicketConfigResponseAppModel.s && this.t == groupTicketConfigResponseAppModel.t && this.u == groupTicketConfigResponseAppModel.u && Intrinsics.d(this.v, groupTicketConfigResponseAppModel.v) && Intrinsics.d(this.w, groupTicketConfigResponseAppModel.w) && Intrinsics.d(this.x, groupTicketConfigResponseAppModel.x);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.q;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.n;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e((this.p.hashCode() + ((((nf1.e(nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l), 31, this.m) + (this.n ? 1231 : 1237)) * 31) + (this.o ? 1231 : 1237)) * 31)) * 31, 31, this.q), 31, this.r);
            long j = this.s;
            int i = (((((iE + ((int) (j ^ (j >>> 32)))) * 31) + this.t) * 31) + this.u) * 31;
            List list = this.v;
            return this.x.hashCode() + r30.b((i + (list == null ? 0 : list.hashCode())) * 31, 31, this.w);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getF() {
            return this.o;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("GroupTicketConfigResponseAppModel(id=", this.j, ", name=", this.k, ", city=");
            cb0.t(sbE, this.l, ", agency=", this.m, ", isActive=");
            z40.r(sbE, this.n, ", isVisible=", this.o, ", branding=");
            sbE.append(this.p);
            sbE.append(", productType=");
            sbE.append(this.q);
            sbE.append(", productSubType=");
            n21.p(this.s, this.r, ", activeDuration=", sbE);
            z40.o(this.t, this.u, ", minAppVer=", ", maxAppVer=", sbE);
            sbE.append(", productImageUrls=");
            sbE.append(this.v);
            sbE.append(", terms=");
            sbE.append(this.w);
            sbE.append(", eligibleSubProducts=");
            sbE.append(this.x);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$InstantTicketConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstantTicketConfigResponseAppModel extends ProductConfigResponseAppModel {
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final boolean n;
        public final BrandingDetails o;
        public final String p;
        public final String q;
        public final FareInfo r;
        public final long s;
        public final boolean t;
        public final boolean u;
        public final List v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstantTicketConfigResponseAppModel(String id, String name, String city, String agency, boolean z, BrandingDetails brandingDetails, String productType, String productSubType, FareInfo fareInfo, long j, boolean z2, boolean z3, List list) {
            super(id, productType, name, agency, z, true, 1000, -1, -1);
            Intrinsics.i(id, "id");
            Intrinsics.i(name, "name");
            Intrinsics.i(city, "city");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.j = id;
            this.k = name;
            this.l = city;
            this.m = agency;
            this.n = z;
            this.o = brandingDetails;
            this.p = productType;
            this.q = productSubType;
            this.r = fareInfo;
            this.s = j;
            this.t = z2;
            this.u = z3;
            this.v = list;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.m;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstantTicketConfigResponseAppModel)) {
                return false;
            }
            InstantTicketConfigResponseAppModel instantTicketConfigResponseAppModel = (InstantTicketConfigResponseAppModel) obj;
            return Intrinsics.d(this.j, instantTicketConfigResponseAppModel.j) && Intrinsics.d(this.k, instantTicketConfigResponseAppModel.k) && Intrinsics.d(this.l, instantTicketConfigResponseAppModel.l) && Intrinsics.d(this.m, instantTicketConfigResponseAppModel.m) && this.n == instantTicketConfigResponseAppModel.n && Intrinsics.d(this.o, instantTicketConfigResponseAppModel.o) && Intrinsics.d(this.p, instantTicketConfigResponseAppModel.p) && Intrinsics.d(this.q, instantTicketConfigResponseAppModel.q) && Intrinsics.d(this.r, instantTicketConfigResponseAppModel.r) && this.s == instantTicketConfigResponseAppModel.s && this.t == instantTicketConfigResponseAppModel.t && this.u == instantTicketConfigResponseAppModel.u && Intrinsics.d(this.v, instantTicketConfigResponseAppModel.v);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.p;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.n;
        }

        public final int hashCode() {
            int iHashCode = (this.r.hashCode() + nf1.e(nf1.e((this.o.hashCode() + ((nf1.e(nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l), 31, this.m) + (this.n ? 1231 : 1237)) * 31)) * 31, 31, this.p), 31, this.q)) * 31;
            long j = this.s;
            int i = (((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.t ? 1231 : 1237)) * 31) + (this.u ? 1231 : 1237)) * 31;
            List list = this.v;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("InstantTicketConfigResponseAppModel(id=", this.j, ", name=", this.k, ", city=");
            cb0.t(sbE, this.l, ", agency=", this.m, ", isActive=");
            sbE.append(this.n);
            sbE.append(", branding=");
            sbE.append(this.o);
            sbE.append(", productType=");
            cb0.t(sbE, this.p, ", productSubType=", this.q, ", fareInfo=");
            sbE.append(this.r);
            sbE.append(", activeDuration=");
            sbE.append(this.s);
            sbE.append(", showOtherModes=");
            sbE.append(this.t);
            sbE.append(", showFindMyFare=");
            sbE.append(this.u);
            sbE.append(", productImageUrls=");
            sbE.append(this.v);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$QuickPayConfigResponseAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayConfigResponseAppModel extends ProductConfigResponseAppModel {
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final boolean p;
        public final long q;
        public final int r;
        public final int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickPayConfigResponseAppModel(String id, String productType, String productSubType, String str, String agency, String city, boolean z, long j, int i, int i2) {
            super(id, productType, str, agency, z, true, 1000, i, i2);
            Intrinsics.i(id, "id");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(city, "city");
            this.j = id;
            this.k = productType;
            this.l = productSubType;
            this.m = str;
            this.n = agency;
            this.o = city;
            this.p = z;
            this.q = j;
            this.r = i;
            this.s = i2;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.n;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.s;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.r;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayConfigResponseAppModel)) {
                return false;
            }
            QuickPayConfigResponseAppModel quickPayConfigResponseAppModel = (QuickPayConfigResponseAppModel) obj;
            return Intrinsics.d(this.j, quickPayConfigResponseAppModel.j) && Intrinsics.d(this.k, quickPayConfigResponseAppModel.k) && Intrinsics.d(this.l, quickPayConfigResponseAppModel.l) && Intrinsics.d(this.m, quickPayConfigResponseAppModel.m) && Intrinsics.d(this.n, quickPayConfigResponseAppModel.n) && Intrinsics.d(this.o, quickPayConfigResponseAppModel.o) && this.p == quickPayConfigResponseAppModel.p && this.q == quickPayConfigResponseAppModel.q && this.r == quickPayConfigResponseAppModel.r && this.s == quickPayConfigResponseAppModel.s;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.k;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.p;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
            int i = this.p ? 1231 : 1237;
            long j = this.q;
            return ((((((iE + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.r) * 31) + this.s;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("QuickPayConfigResponseAppModel(id=", this.j, ", productType=", this.k, ", productSubType=");
            cb0.t(sbE, this.l, ", name=", this.m, ", agency=");
            cb0.t(sbE, this.n, ", city=", this.o, ", isActive=");
            sbE.append(this.p);
            sbE.append(", activeDuration=");
            sbE.append(this.q);
            z40.o(this.r, this.s, ", minAppVer=", ", maxAppVer=", sbE);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$SingleJourneyTicketAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleJourneyTicketAppModel extends ProductConfigResponseAppModel {
        public final List A;
        public final List B;
        public final List C;
        public final List D;
        public final boolean E;
        public final String F;
        public final boolean G;
        public final boolean H;
        public final int I;
        public final int J;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final int q;
        public final String r;
        public final String s;
        public final String t;
        public final BrandingDetails u;
        public final long v;
        public final long w;
        public final List x;
        public final UnknownProductSubCategorySelectionResponseAppModel y;
        public final ArrayList z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleJourneyTicketAppModel(String id, String city, String name, String str, String str2, String str3, String str4, int i, String productType, String productSubType, String agency, BrandingDetails brandingDetails, long j, long j2, List subCategory, UnknownProductSubCategorySelectionResponseAppModel unknownProductSubCategorySelectionResponseAppModel, ArrayList arrayList, List validDurations, List fareMapping, List terms, List list, boolean z, String str5, boolean z2, boolean z3, int i2, int i3) {
            super(id, productType, name, agency, z, z2, i, i2, i3);
            Intrinsics.i(id, "id");
            Intrinsics.i(city, "city");
            Intrinsics.i(name, "name");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(subCategory, "subCategory");
            Intrinsics.i(validDurations, "validDurations");
            Intrinsics.i(fareMapping, "fareMapping");
            Intrinsics.i(terms, "terms");
            this.j = id;
            this.k = city;
            this.l = name;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = str4;
            this.q = i;
            this.r = productType;
            this.s = productSubType;
            this.t = agency;
            this.u = brandingDetails;
            this.v = j;
            this.w = j2;
            this.x = subCategory;
            this.y = unknownProductSubCategorySelectionResponseAppModel;
            this.z = arrayList;
            this.A = validDurations;
            this.B = fareMapping;
            this.C = terms;
            this.D = list;
            this.E = z;
            this.F = str5;
            this.G = z2;
            this.H = z3;
            this.I = i2;
            this.J = i3;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.t;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.J;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.I;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleJourneyTicketAppModel)) {
                return false;
            }
            SingleJourneyTicketAppModel singleJourneyTicketAppModel = (SingleJourneyTicketAppModel) obj;
            return Intrinsics.d(this.j, singleJourneyTicketAppModel.j) && Intrinsics.d(this.k, singleJourneyTicketAppModel.k) && Intrinsics.d(this.l, singleJourneyTicketAppModel.l) && Intrinsics.d(this.m, singleJourneyTicketAppModel.m) && Intrinsics.d(this.n, singleJourneyTicketAppModel.n) && Intrinsics.d(this.o, singleJourneyTicketAppModel.o) && Intrinsics.d(this.p, singleJourneyTicketAppModel.p) && this.q == singleJourneyTicketAppModel.q && Intrinsics.d(this.r, singleJourneyTicketAppModel.r) && Intrinsics.d(this.s, singleJourneyTicketAppModel.s) && Intrinsics.d(this.t, singleJourneyTicketAppModel.t) && this.u.equals(singleJourneyTicketAppModel.u) && this.v == singleJourneyTicketAppModel.v && this.w == singleJourneyTicketAppModel.w && Intrinsics.d(this.x, singleJourneyTicketAppModel.x) && Intrinsics.d(this.y, singleJourneyTicketAppModel.y) && this.z.equals(singleJourneyTicketAppModel.z) && Intrinsics.d(this.A, singleJourneyTicketAppModel.A) && Intrinsics.d(this.B, singleJourneyTicketAppModel.B) && Intrinsics.d(this.C, singleJourneyTicketAppModel.C) && this.D.equals(singleJourneyTicketAppModel.D) && this.E == singleJourneyTicketAppModel.E && Intrinsics.d(this.F, singleJourneyTicketAppModel.F) && this.G == singleJourneyTicketAppModel.G && this.H == singleJourneyTicketAppModel.H && this.I == singleJourneyTicketAppModel.I && this.J == singleJourneyTicketAppModel.J;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getG() {
            return this.q;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.r;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.E;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l);
            String str = this.m;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.p;
            int iHashCode4 = (this.u.hashCode() + nf1.e(nf1.e(nf1.e((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.q) * 31, 31, this.r), 31, this.s), 31, this.t)) * 31;
            long j = this.v;
            int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.w;
            int iB = r30.b((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.x);
            UnknownProductSubCategorySelectionResponseAppModel unknownProductSubCategorySelectionResponseAppModel = this.y;
            int iB2 = (r30.b(r30.b(r30.b(r30.b(xs.e(this.z, (iB + (unknownProductSubCategorySelectionResponseAppModel == null ? 0 : unknownProductSubCategorySelectionResponseAppModel.hashCode())) * 31, 31), 31, this.A), 31, this.B), 31, this.C), 31, this.D) + (this.E ? 1231 : 1237)) * 31;
            String str5 = this.F;
            return ((((((((iB2 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.G ? 1231 : 1237)) * 31) + (this.H ? 1231 : 1237)) * 31) + this.I) * 31) + this.J;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getF() {
            return this.G;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SingleJourneyTicketAppModel(id=", this.j, ", city=", this.k, ", name=");
            cb0.t(sbE, this.l, ", desc=", this.m, ", icon=");
            cb0.t(sbE, this.n, ", label=", this.o, ", additionalInfo=");
            cb0.o(this.q, this.p, ", priority=", ", productType=", sbE);
            cb0.t(sbE, this.r, ", productSubType=", this.s, ", agency=");
            sbE.append(this.t);
            sbE.append(", productBranding=");
            sbE.append(this.u);
            sbE.append(", validity=");
            sbE.append(this.v);
            xs.r(this.w, ", activeDuration=", ", subCategory=", sbE);
            sbE.append(this.x);
            sbE.append(", subCategorySelection=");
            sbE.append(this.y);
            sbE.append(", categories=");
            sbE.append(this.z);
            sbE.append(", validDurations=");
            sbE.append(this.A);
            sbE.append(", fareMapping=");
            dd.o(sbE, this.B, ", terms=", this.C, ", serviceType=");
            sbE.append(this.D);
            sbE.append(", isActive=");
            sbE.append(this.E);
            sbE.append(", inactiveReason=");
            t10.s(this.F, ", isVisible=", ", shouldHideSubCategorySelection=", sbE, this.G);
            sbE.append(this.H);
            sbE.append(", minAppVer=");
            sbE.append(this.I);
            sbE.append(", maxAppVer=");
            return b3.f(")", this.J, sbE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$SuperPassConfigAppModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPassConfigAppModel extends ProductConfigResponseAppModel {
        public final boolean A;
        public final int B;
        public final int C;
        public final BrandingDetails D;
        public final List E;
        public final ProductConfigSubCategorySelectionAppModel F;
        public final List G;
        public final List H;
        public final List I;
        public final boolean J;
        public final List K;
        public final List L;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final boolean p;
        public final boolean q;
        public final int r;
        public final long s;
        public final ArrayList t;
        public final ArrayList u;
        public final String v;
        public final String w;
        public final String x;
        public final String y;
        public final String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuperPassConfigAppModel(String id, String productType, String productSubType, String name, String agency, String city, boolean z, boolean z2, int i, long j, ArrayList arrayList, ArrayList arrayList2, String str, String str2, String str3, String str4, String str5, boolean z3, int i2, int i3, BrandingDetails brandingDetails, List subCategory, ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel, List terms, List highlightedTerms, List list, boolean z4, ArrayList arrayList3, ArrayList arrayList4) {
            super(id, productType, name, agency, z, z2, i, i2, i3);
            Intrinsics.i(id, "id");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(name, "name");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(city, "city");
            Intrinsics.i(subCategory, "subCategory");
            Intrinsics.i(terms, "terms");
            Intrinsics.i(highlightedTerms, "highlightedTerms");
            this.j = id;
            this.k = productType;
            this.l = productSubType;
            this.m = name;
            this.n = agency;
            this.o = city;
            this.p = z;
            this.q = z2;
            this.r = i;
            this.s = j;
            this.t = arrayList;
            this.u = arrayList2;
            this.v = str;
            this.w = str2;
            this.x = str3;
            this.y = str4;
            this.z = str5;
            this.A = z3;
            this.B = i2;
            this.C = i3;
            this.D = brandingDetails;
            this.E = subCategory;
            this.F = productConfigSubCategorySelectionAppModel;
            this.G = terms;
            this.H = highlightedTerms;
            this.I = list;
            this.J = z4;
            this.K = arrayList3;
            this.L = arrayList4;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.n;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.C;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.B;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassConfigAppModel)) {
                return false;
            }
            SuperPassConfigAppModel superPassConfigAppModel = (SuperPassConfigAppModel) obj;
            return Intrinsics.d(this.j, superPassConfigAppModel.j) && Intrinsics.d(this.k, superPassConfigAppModel.k) && Intrinsics.d(this.l, superPassConfigAppModel.l) && Intrinsics.d(this.m, superPassConfigAppModel.m) && Intrinsics.d(this.n, superPassConfigAppModel.n) && Intrinsics.d(this.o, superPassConfigAppModel.o) && this.p == superPassConfigAppModel.p && this.q == superPassConfigAppModel.q && this.r == superPassConfigAppModel.r && this.s == superPassConfigAppModel.s && this.t.equals(superPassConfigAppModel.t) && this.u.equals(superPassConfigAppModel.u) && Intrinsics.d(this.v, superPassConfigAppModel.v) && Intrinsics.d(this.w, superPassConfigAppModel.w) && Intrinsics.d(this.x, superPassConfigAppModel.x) && Intrinsics.d(this.y, superPassConfigAppModel.y) && Intrinsics.d(this.z, superPassConfigAppModel.z) && this.A == superPassConfigAppModel.A && this.B == superPassConfigAppModel.B && this.C == superPassConfigAppModel.C && this.D.equals(superPassConfigAppModel.D) && Intrinsics.d(this.E, superPassConfigAppModel.E) && Intrinsics.d(this.F, superPassConfigAppModel.F) && Intrinsics.d(this.G, superPassConfigAppModel.G) && Intrinsics.d(this.H, superPassConfigAppModel.H) && this.I.equals(superPassConfigAppModel.I) && this.J == superPassConfigAppModel.J && Intrinsics.d(this.K, superPassConfigAppModel.K) && Intrinsics.d(this.L, superPassConfigAppModel.L);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getG() {
            return this.r;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.k;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.p;
        }

        public final int hashCode() {
            int iE = (((((nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31) + this.r) * 31;
            long j = this.s;
            int iE2 = xs.e(this.u, xs.e(this.t, (iE + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
            String str = this.v;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.w;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.x;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.y;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.z;
            int iB = r30.b((this.D.hashCode() + ((((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.A ? 1231 : 1237)) * 31) + this.B) * 31) + this.C) * 31)) * 31, 31, this.E);
            ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = this.F;
            int iB2 = (r30.b(r30.b(r30.b((iB + (productConfigSubCategorySelectionAppModel == null ? 0 : productConfigSubCategorySelectionAppModel.hashCode())) * 31, 31, this.G), 31, this.H), 31, this.I) + (this.J ? 1231 : 1237)) * 31;
            List list = this.K;
            int iHashCode5 = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.L;
            return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getF() {
            return this.q;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SuperPassConfigAppModel(id=", this.j, ", productType=", this.k, ", productSubType=");
            cb0.t(sbE, this.l, ", name=", this.m, ", agency=");
            cb0.t(sbE, this.n, ", city=", this.o, ", isActive=");
            z40.r(sbE, this.p, ", isVisible=", this.q, ", priority=");
            sbE.append(this.r);
            sbE.append(", activeDuration=");
            sbE.append(this.s);
            sbE.append(", categories=");
            sbE.append(this.t);
            sbE.append(", fareMapping=");
            sbE.append(this.u);
            cb0.t(sbE, ", productDescription=", this.v, ", icon=", this.w);
            cb0.t(sbE, ", label=", this.x, ", additionalInfo=", this.y);
            sbE.append(", inactiveReason=");
            sbE.append(this.z);
            sbE.append(", shouldHideSubCategorySelection=");
            sbE.append(this.A);
            z40.o(this.B, this.C, ", minAppVer=", ", maxAppVer=", sbE);
            sbE.append(", branding=");
            sbE.append(this.D);
            sbE.append(", subCategory=");
            sbE.append(this.E);
            sbE.append(", subCategorySelection=");
            sbE.append(this.F);
            sbE.append(", terms=");
            sbE.append(this.G);
            sbE.append(", highlightedTerms=");
            sbE.append(this.H);
            sbE.append(", serviceType=");
            sbE.append(this.I);
            sbE.append(", isStopBasedPass=");
            sbE.append(this.J);
            sbE.append(", imageUrls=");
            sbE.append(this.K);
            sbE.append(", applicableRules=");
            sbE.append(this.L);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel$UnknownProductConfigApiResponseModel;", "Lapp/chalo/productpurchase/productselection/data/models/app/ProductConfigResponseAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownProductConfigApiResponseModel extends ProductConfigResponseAppModel {
        public final List A;
        public final List B;
        public final List C;
        public final List D;
        public final boolean E;
        public final String F;
        public final boolean G;
        public final boolean H;
        public final int I;
        public final int J;
        public final boolean K;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final int q;
        public final String r;
        public final String s;
        public final String t;
        public final BrandingDetails u;
        public final long v;
        public final long w;
        public final List x;
        public final UnknownProductSubCategorySelectionResponseAppModel y;
        public final ArrayList z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownProductConfigApiResponseModel(String id, String city, String name, String str, String str2, String str3, String str4, int i, String productType, String productSubType, String agency, BrandingDetails brandingDetails, long j, long j2, List subCategory, UnknownProductSubCategorySelectionResponseAppModel unknownProductSubCategorySelectionResponseAppModel, ArrayList arrayList, List validDurations, List fareMapping, List terms, List list, boolean z, String str5, boolean z2, boolean z3, int i2, int i3, boolean z4) {
            super(id, productType, name, agency, z, z2, i, i2, i3);
            Intrinsics.i(id, "id");
            Intrinsics.i(city, "city");
            Intrinsics.i(name, "name");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(subCategory, "subCategory");
            Intrinsics.i(validDurations, "validDurations");
            Intrinsics.i(fareMapping, "fareMapping");
            Intrinsics.i(terms, "terms");
            this.j = id;
            this.k = city;
            this.l = name;
            this.m = str;
            this.n = str2;
            this.o = str3;
            this.p = str4;
            this.q = i;
            this.r = productType;
            this.s = productSubType;
            this.t = agency;
            this.u = brandingDetails;
            this.v = j;
            this.w = j2;
            this.x = subCategory;
            this.y = unknownProductSubCategorySelectionResponseAppModel;
            this.z = arrayList;
            this.A = validDurations;
            this.B = fareMapping;
            this.C = terms;
            this.D = list;
            this.E = z;
            this.F = str5;
            this.G = z2;
            this.H = z3;
            this.I = i2;
            this.J = i3;
            this.K = z4;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.t;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF8638a() {
            return this.j;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getI() {
            return this.J;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getH() {
            return this.I;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getC() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownProductConfigApiResponseModel)) {
                return false;
            }
            UnknownProductConfigApiResponseModel unknownProductConfigApiResponseModel = (UnknownProductConfigApiResponseModel) obj;
            return Intrinsics.d(this.j, unknownProductConfigApiResponseModel.j) && Intrinsics.d(this.k, unknownProductConfigApiResponseModel.k) && Intrinsics.d(this.l, unknownProductConfigApiResponseModel.l) && Intrinsics.d(this.m, unknownProductConfigApiResponseModel.m) && Intrinsics.d(this.n, unknownProductConfigApiResponseModel.n) && Intrinsics.d(this.o, unknownProductConfigApiResponseModel.o) && Intrinsics.d(this.p, unknownProductConfigApiResponseModel.p) && this.q == unknownProductConfigApiResponseModel.q && Intrinsics.d(this.r, unknownProductConfigApiResponseModel.r) && Intrinsics.d(this.s, unknownProductConfigApiResponseModel.s) && Intrinsics.d(this.t, unknownProductConfigApiResponseModel.t) && this.u.equals(unknownProductConfigApiResponseModel.u) && this.v == unknownProductConfigApiResponseModel.v && this.w == unknownProductConfigApiResponseModel.w && Intrinsics.d(this.x, unknownProductConfigApiResponseModel.x) && Intrinsics.d(this.y, unknownProductConfigApiResponseModel.y) && this.z.equals(unknownProductConfigApiResponseModel.z) && Intrinsics.d(this.A, unknownProductConfigApiResponseModel.A) && Intrinsics.d(this.B, unknownProductConfigApiResponseModel.B) && Intrinsics.d(this.C, unknownProductConfigApiResponseModel.C) && this.D.equals(unknownProductConfigApiResponseModel.D) && this.E == unknownProductConfigApiResponseModel.E && Intrinsics.d(this.F, unknownProductConfigApiResponseModel.F) && this.G == unknownProductConfigApiResponseModel.G && this.H == unknownProductConfigApiResponseModel.H && this.I == unknownProductConfigApiResponseModel.I && this.J == unknownProductConfigApiResponseModel.J && this.K == unknownProductConfigApiResponseModel.K;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getG() {
            return this.q;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getB() {
            return this.r;
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getE() {
            return this.E;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.j.hashCode() * 31, 31, this.k), 31, this.l);
            String str = this.m;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.n;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.o;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.p;
            int iHashCode4 = (this.u.hashCode() + nf1.e(nf1.e(nf1.e((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.q) * 31, 31, this.r), 31, this.s), 31, this.t)) * 31;
            long j = this.v;
            int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.w;
            int iB = r30.b((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.x);
            UnknownProductSubCategorySelectionResponseAppModel unknownProductSubCategorySelectionResponseAppModel = this.y;
            int iB2 = (r30.b(r30.b(r30.b(r30.b(xs.e(this.z, (iB + (unknownProductSubCategorySelectionResponseAppModel == null ? 0 : unknownProductSubCategorySelectionResponseAppModel.hashCode())) * 31, 31), 31, this.A), 31, this.B), 31, this.C), 31, this.D) + (this.E ? 1231 : 1237)) * 31;
            String str5 = this.F;
            return ((((((((((iB2 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.G ? 1231 : 1237)) * 31) + (this.H ? 1231 : 1237)) * 31) + this.I) * 31) + this.J) * 31) + (this.K ? 1231 : 1237);
        }

        @Override // app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel
        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getF() {
            return this.G;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("UnknownProductConfigApiResponseModel(id=", this.j, ", city=", this.k, ", name=");
            cb0.t(sbE, this.l, ", desc=", this.m, ", icon=");
            cb0.t(sbE, this.n, ", label=", this.o, ", additionalInfo=");
            cb0.o(this.q, this.p, ", priority=", ", productType=", sbE);
            cb0.t(sbE, this.r, ", productSubType=", this.s, ", agency=");
            sbE.append(this.t);
            sbE.append(", productBranding=");
            sbE.append(this.u);
            sbE.append(", validity=");
            sbE.append(this.v);
            xs.r(this.w, ", activeDuration=", ", subCategory=", sbE);
            sbE.append(this.x);
            sbE.append(", subCategorySelection=");
            sbE.append(this.y);
            sbE.append(", categories=");
            sbE.append(this.z);
            sbE.append(", validDurations=");
            sbE.append(this.A);
            sbE.append(", fareMapping=");
            dd.o(sbE, this.B, ", terms=", this.C, ", serviceType=");
            sbE.append(this.D);
            sbE.append(", isActive=");
            sbE.append(this.E);
            sbE.append(", inactiveReason=");
            t10.s(this.F, ", isVisible=", ", shouldHideSubCategorySelection=", sbE, this.G);
            sbE.append(this.H);
            sbE.append(", minAppVer=");
            sbE.append(this.I);
            sbE.append(", maxAppVer=");
            sbE.append(this.J);
            sbE.append(", isStopBasedPass=");
            sbE.append(this.K);
            sbE.append(")");
            return sbE.toString();
        }
    }

    public ProductConfigResponseAppModel(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, int i3) {
        this.f8638a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getF8638a() {
        return this.f8638a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public int getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getF() {
        return this.f;
    }
}
