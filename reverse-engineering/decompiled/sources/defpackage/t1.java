package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.MutableState;
import app.chalo.checkout.ui.screen.payment.PaymentViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19618a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ t1(MutableState mutableState, int i) {
        this.f19618a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19618a) {
            case 0:
                this.b.setValue(Boolean.FALSE);
                return Unit.f17538a;
            case 1:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$4$0(this.b);
            case 2:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$1$0$0(this.b);
            case 3:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0(this.b);
            case 4:
                MutableState mutableState = this.b;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.f17538a;
            case 5:
                MutableState mutableState2 = this.b;
                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                return Unit.f17538a;
            case 6:
                this.b.setValue(Boolean.FALSE);
                return Unit.f17538a;
            case 7:
                MutableState mutableState3 = this.b;
                mutableState3.setValue(Boolean.valueOf(!((Boolean) mutableState3.getValue()).booleanValue()));
                return Unit.f17538a;
            case 8:
                MutableState mutableState4 = this.b;
                mutableState4.setValue(Boolean.valueOf(!((Boolean) mutableState4.getValue()).booleanValue()));
                return Unit.f17538a;
            case 9:
                this.b.setValue(Boolean.FALSE);
                return Unit.f17538a;
            case 10:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$33$lambda$32(this.b);
            case 11:
                return Boolean.valueOf(((QRScannerViewState) this.b.getValue()).g != null);
            case 12:
                return DragHandleKt.VerticalDragHandle$lambda$6$lambda$5(this.b);
            case 13:
                return DragHandleKt.VerticalDragHandle$lambda$8$lambda$7(this.b);
            case 14:
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1(this.b);
            case 15:
                MutableState mutableState5 = this.b;
                mutableState5.setValue(Boolean.valueOf(!((Boolean) mutableState5.getValue()).booleanValue()));
                return Unit.f17538a;
            case 16:
                MutableState mutableState6 = this.b;
                mutableState6.setValue(Boolean.valueOf(!((Boolean) mutableState6.getValue()).booleanValue()));
                return Unit.f17538a;
            case 17:
                this.b.setValue(Boolean.FALSE);
                return Unit.f17538a;
            case 18:
                MutableState mutableState7 = this.b;
                mutableState7.setValue(Boolean.valueOf(!((Boolean) mutableState7.getValue()).booleanValue()));
                return Unit.f17538a;
            case 19:
                MutableState mutableState8 = this.b;
                mutableState8.setValue(Boolean.valueOf(!((Boolean) mutableState8.getValue()).booleanValue()));
                return Unit.f17538a;
            case 20:
                this.b.setValue(Boolean.FALSE);
                return Unit.f17538a;
            case 21:
                MutableState mutableState9 = this.b;
                mutableState9.setValue(Boolean.valueOf(!((Boolean) mutableState9.getValue()).booleanValue()));
                return Unit.f17538a;
            case 22:
                ((PaymentViewState) this.b.getValue()).l.a();
                return Unit.f17538a;
            case 23:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$3$0(this.b);
            case 24:
                this.b.setValue(Boolean.TRUE);
                return Unit.f17538a;
            case 25:
                MutableState mutableState10 = this.b;
                mutableState10.setValue(Boolean.valueOf(!((Boolean) mutableState10.getValue()).booleanValue()));
                return Unit.f17538a;
            case 26:
                MutableState mutableState11 = this.b;
                mutableState11.setValue(Boolean.valueOf(!((Boolean) mutableState11.getValue()).booleanValue()));
                return Unit.f17538a;
            case 27:
                MutableState mutableState12 = this.b;
                mutableState12.setValue(Boolean.valueOf(!((Boolean) mutableState12.getValue()).booleanValue()));
                return Unit.f17538a;
            case 28:
                MutableState mutableState13 = this.b;
                mutableState13.setValue(Boolean.valueOf(!((Boolean) mutableState13.getValue()).booleanValue()));
                return Unit.f17538a;
            default:
                MutableState mutableState14 = this.b;
                mutableState14.setValue(Boolean.valueOf(!((Boolean) mutableState14.getValue()).booleanValue()));
                return Unit.f17538a;
        }
    }
}
