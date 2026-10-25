package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11266a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ColorProducer i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ CharSequence l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ca(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, int i4, int i5) {
        this.l = annotatedString;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.m = map;
        this.i = colorProducer;
        this.j = i4;
        this.k = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11266a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_RWo7tUw$lambda$3((AnnotatedString) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Map) this.m, this.i, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_RWo7tUw$lambda$2((String) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (TextAutoSize) this.m, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ca(String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, TextAutoSize textAutoSize, int i4, int i5) {
        this.l = str;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = colorProducer;
        this.m = textAutoSize;
        this.j = i4;
        this.k = i5;
    }
}
