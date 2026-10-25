package defpackage;

import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.carousel.CarouselStateKt;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15638a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fg(int i, Object obj, int i2) {
        this.f15638a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15638a) {
            case 0:
                return CarouselStateKt.rememberCarouselState$lambda$1$lambda$0(this.b, (Function0) this.c);
            case 1:
                return LoremIpsum.generateLoremIpsum$lambda$0((Ref.IntRef) this.c, this.b);
            case 2:
                return Integer.valueOf(SelectionAdjustmentKt.updateSelectionBoundary$lambda$0((SelectableInfo) this.c, this.b));
            default:
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$58$lambda$57(this.b, (TimePickerState) this.c);
        }
    }

    public /* synthetic */ fg(Object obj, int i, int i2) {
        this.f15638a = i2;
        this.c = obj;
        this.b = i;
    }
}
