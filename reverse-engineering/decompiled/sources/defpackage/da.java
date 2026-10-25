package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15440a = 0;
    public final /* synthetic */ AnnotatedString b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TextStyle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ da(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, int i3, int i4) {
        this.b = annotatedString;
        this.c = modifier;
        this.d = textStyle;
        this.h = function1;
        this.f = i;
        this.e = z;
        this.g = i2;
        this.k = map;
        this.i = i3;
        this.j = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15440a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_4YKlhWE$lambda$0(this.b, this.c, this.d, this.h, this.f, this.e, this.g, (Map) this.k, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$4(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Function1) this.k, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ da(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1 function1, Function1 function2, int i3, int i4) {
        this.b = annotatedString;
        this.c = modifier;
        this.d = textStyle;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = function1;
        this.k = function2;
        this.i = i3;
        this.j = i4;
    }
}
