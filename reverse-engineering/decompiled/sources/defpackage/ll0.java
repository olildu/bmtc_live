package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.ads.NativeInlineAdTemplatesKt;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ll0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18324a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    public /* synthetic */ ll0(Modifier modifier, Function2 function2, Function2 function3, Function2 function4, DatePickerColors datePickerColors, TextStyle textStyle, float f, Function2 function5, int i) {
        this.f18324a = 2;
        this.i = modifier;
        this.h = function2;
        this.b = function3;
        this.d = function4;
        this.e = datePickerColors;
        this.f = textStyle;
        this.c = f;
        this.g = function5;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18324a) {
            case 0:
                ((Integer) obj2).getClass();
                NativeInlineAdTemplatesKt.d((NativeAd) this.b, this.c, (Integer) this.d, (Function1) this.e, (Function1) this.f, (Function1) this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                NativeInlineAdTemplatesKt.c((NativeAd) this.b, this.c, (Integer) this.d, (Function1) this.e, (Function1) this.f, (Function1) this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.DateEntryContainer_au3_HiA$lambda$10(this.i, this.h, (Function2) this.b, (Function2) this.d, (DatePickerColors) this.e, (TextStyle) this.f, this.c, (Function2) this.g, this.j, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ ll0(NativeAd nativeAd, float f, Integer num, Function1 function1, Function1 function2, Function1 function3, Function2 function4, Modifier modifier, int i, int i2) {
        this.f18324a = i2;
        this.b = nativeAd;
        this.c = f;
        this.d = num;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.h = function4;
        this.i = modifier;
        this.j = i;
    }
}
