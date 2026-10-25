package defpackage;

import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.FloatProducer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx implements FloatProducer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20238a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx(Object obj, int i) {
        this.f20238a = i;
        this.b = obj;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        switch (this.f20238a) {
            case 0:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$12$lambda$11((SingleRowTopAppBarOverrideScope) this.b);
            default:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24((TwoRowsTopAppBarOverrideScope) this.b);
        }
    }
}
