package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class op implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18660a;
    public final /* synthetic */ FocusRequester b;

    public /* synthetic */ op(FocusRequester focusRequester, int i) {
        this.f18660a = i;
        this.b = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates it = (LayoutCoordinates) obj;
        switch (this.f18660a) {
            case 0:
                Intrinsics.i(it, "it");
                FocusRequester.m4269requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 1:
                Intrinsics.i(it, "it");
                FocusRequester.m4269requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            default:
                Intrinsics.i(it, "it");
                FocusRequester.m4269requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
        }
        return Unit.f17538a;
    }
}
