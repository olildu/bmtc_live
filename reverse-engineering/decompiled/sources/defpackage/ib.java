package defpackage;

import androidx.compose.runtime.MutableState;
import app.chalo.home.BottomSheetState;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ib implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15897a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ ib(Function1 function1, MutableState mutableState, int i) {
        this.f15897a = i;
        this.b = function1;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15897a) {
            case 0:
                this.b.invoke(BleValidationIntent.ViewTripReceiptMenuOptionClickedIntent.f10603a);
                MutableState mutableState = this.c;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 1:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 2:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 3:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 4:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 5:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 6:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 7:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            case 8:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
            default:
                this.b.invoke(new HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent(((BottomSheetState) this.c.getValue()).b));
                break;
        }
        return Unit.f17538a;
    }
}
