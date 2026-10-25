package app.chalo.instantticket.validation;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/validation/InstantTicketValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3978a;
    public final String b;
    public final long c;
    public final Long d;
    public final int e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final RouteStopsInfo j;

    public InstantTicketValidationModel(InstantTicketStatus status, String str, String str2, long j, Long l, int i, String orderId, Long l2, String productName, String city, RouteStopsInfo routeStopsInfo) {
        Intrinsics.i(status, "status");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(city, "city");
        this.f3978a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = i;
        this.f = orderId;
        this.g = l2;
        this.h = productName;
        this.i = city;
        this.j = routeStopsInfo;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String a() {
        return "mobileTicket";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String b() {
        return "instantTicket";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        Long l = null;
        Long l2 = this.g;
        if (l2 != null && l2.longValue() > 0) {
            l = l2;
        }
        return l != null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getG() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF3978a() {
        return this.f3978a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getH() {
        return this.h;
    }
}
