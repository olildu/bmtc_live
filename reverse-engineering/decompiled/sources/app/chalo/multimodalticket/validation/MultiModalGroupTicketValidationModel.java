package app.chalo.multimodalticket.validation;

import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import defpackage.gd0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5979a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final gd0 g;
    public final LinkedHashMap h;

    public MultiModalGroupTicketValidationModel(String productType, String productSubType, String orderId, int i, long j, String productName, MultiModalGroupTicketStatus status, gd0 gd0Var, LinkedHashMap linkedHashMap) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(status, "status");
        this.f5979a = productType;
        this.b = productSubType;
        this.c = orderId;
        this.d = i;
        this.e = j;
        this.f = productName;
        this.g = gd0Var;
        this.h = linkedHashMap;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getI() {
        return this.f5979a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJ() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getH() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        return ((Boolean) this.g.invoke()).booleanValue();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e */
    public final Long getJ() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f */
    public final String getD() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g */
    public final String getC() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getG() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getE() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getK() {
        return this.f;
    }
}
