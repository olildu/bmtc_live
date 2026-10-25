package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wj0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19934a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ wj0(MovableContent movableContent, int i) {
        this.f19934a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19934a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$1(this.b, obj, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$1(this.b, obj, composer, iIntValue);
        }
    }
}
