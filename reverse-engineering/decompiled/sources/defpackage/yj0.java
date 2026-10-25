package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yj0 implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20115a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ yj0(MovableContent movableContent, int i) {
        this.f20115a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f20115a) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return MovableContentKt.movableContentOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj5).intValue();
                return MovableContentKt.movableContentWithReceiverOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, iIntValue2);
        }
    }
}
