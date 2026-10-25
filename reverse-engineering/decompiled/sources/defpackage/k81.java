package defpackage;

import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import app.chalo.utils.SheetDefaultsHelperKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k81 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17475a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ SheetValue e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ k81(boolean z, Function0 function0, Function0 function1, SheetValue sheetValue, Function1 function2, boolean z2, int i) {
        this.f17475a = i;
        this.b = z;
        this.c = function0;
        this.d = function1;
        this.e = sheetValue;
        this.f = function2;
        this.g = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17475a) {
            case 0:
                float f = SheetDefaultsHelperKt.f10439a;
                return new SheetState(this.b, this.c, this.d, this.e, this.f, this.g);
            default:
                return SheetDefaultsKt.rememberSheetState_AGcomas$lambda$11$lambda$10(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
