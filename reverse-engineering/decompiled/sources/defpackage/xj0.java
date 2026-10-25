package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xj0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20026a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ xj0(MovableContent movableContent, int i) {
        this.f20026a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f20026a;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$3(this.b, obj, obj2, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$3(this.b, obj, obj2, composer, iIntValue);
        }
    }
}
