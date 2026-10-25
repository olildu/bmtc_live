package app.chalo.mTicketing.validation;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import defpackage.gd0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketProductValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketProductValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5390a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final MTicketUserDetailsForProducts k;
    public final Function1 l;
    public final Function1 m;
    public final Function1 n;
    public final RouteStopsInfo o;
    public final gd0 p;

    public MTicketProductValidationModel(String transactionId, String paymentMode, String str, String str2, long j, int i, String str3, String str4, String str5, String str6, Long l, MTicketUserDetailsForProducts mTicketUserDetailsForProducts, Function1 function1, Function1 function2, Function1 function3, RouteStopsInfo upTripRouteStopsInfo, gd0 gd0Var) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(upTripRouteStopsInfo, "upTripRouteStopsInfo");
        this.f5390a = transactionId;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = l;
        this.k = mTicketUserDetailsForProducts;
        this.l = function1;
        this.m = function2;
        this.n = function3;
        this.o = upTripRouteStopsInfo;
        this.p = gd0Var;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getI() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJ() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getH() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        return ((Boolean) this.p.invoke()).booleanValue();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getJ() {
        return this.j;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getD() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getC() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getG() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getE() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getK() {
        return this.i;
    }
}
