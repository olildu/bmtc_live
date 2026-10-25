package defpackage;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18415a;
    public final /* synthetic */ FloatProducer b;

    public /* synthetic */ mo0(FloatProducer floatProducer, int i) {
        this.f18415a = i;
        this.b = floatProducer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18415a) {
            case 0:
                return OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15(this.b);
            case 1:
                return Float.valueOf(PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6(this.b));
            default:
                return TextFieldKt.TextFieldLayout$lambda$19$lambda$15$lambda$14(this.b);
        }
    }
}
