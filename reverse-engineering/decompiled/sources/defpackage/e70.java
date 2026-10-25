package defpackage;

import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15525a;
    public final /* synthetic */ Ref.IntRef b;
    public final /* synthetic */ Ref.IntRef c;

    public /* synthetic */ e70(Ref.IntRef intRef, Ref.IntRef intRef2, int i) {
        this.f15525a = i;
        this.b = intRef;
        this.c = intRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15525a) {
            case 0:
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$1(this.b, this.c, (MatchResult) obj);
            default:
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$3(this.b, this.c, (MatchResult) obj);
        }
    }
}
