package defpackage;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ek0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15562a;
    public final /* synthetic */ ProductValidationData b;

    public /* synthetic */ ek0(ProductValidationData productValidationData, int i) {
        this.f15562a = i;
        this.b = productValidationData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15562a) {
            case 0:
                return MultiProductValidationDataState.a((MultiProductValidationDataState) obj, null, this.b, new ActiveQrState(), false, 19);
            default:
                QRValidationDataState it = (QRValidationDataState) obj;
                Intrinsics.i(it, "it");
                return QRValidationDataState.a(it, this.b, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 131070);
        }
    }
}
