package defpackage;

import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15814a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hd(int i, int i2, Function3 function3) {
        this.f15814a = i2;
        this.b = function3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15814a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274065306, iIntValue, -1, "app.chalo.compose.MainBulletListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BulletListComponentWithLineIcon.kt:99)");
                    }
                    this.b.invoke(Integer.valueOf(this.c), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$2(this.b, this.c, composer, iIntValue);
        }
    }
}
