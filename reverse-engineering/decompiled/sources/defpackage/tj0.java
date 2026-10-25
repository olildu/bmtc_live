package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tj0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19664a;
    public final /* synthetic */ Function5 b;

    public /* synthetic */ tj0(int i, Function5 function5) {
        this.f19664a = i;
        this.b = function5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19664a;
        Triple triple = (Triple) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$4(this.b, triple, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$4(this.b, triple, composer, iIntValue);
        }
    }
}
