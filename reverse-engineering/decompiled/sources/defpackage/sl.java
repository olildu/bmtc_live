package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.ui.layout.Placeable;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19312a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ sl(Ref.ObjectRef objectRef, int i) {
        this.f19312a = i;
        this.b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Object, kotlinx.serialization.json.JsonElement] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19312a) {
            case 0:
                this.b.element = null;
                return Unit.f17538a;
            case 1:
                return FlowLayoutKt.breakDownItems_di9J0FM$lambda$0$0(this.b, (Placeable) obj);
            case 2:
                return FlowLayoutKt.breakDownItems_di9J0FM$lambda$2$0(this.b, (Placeable) obj);
            case 3:
                return (SuperPassPurchaseSharedState) this.b.element;
            default:
                ?? it = (JsonElement) obj;
                Intrinsics.i(it, "it");
                this.b.element = it;
                return Unit.f17538a;
        }
    }
}
