package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
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
public final /* synthetic */ class ea implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15532a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ CharSequence k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ea(CharSequence charSequence, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Object obj, int i4, int i5, int i6) {
        this.f15532a = i6;
        this.k = charSequence;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.l = obj;
        this.i = i4;
        this.j = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15532a) {
            case 0:
                return BasicTextKt.BasicText_VhcvRP8$lambda$1((AnnotatedString) this.k, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Map) this.l, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return BasicTextKt.BasicText_VhcvRP8$lambda$0((String) this.k, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (ColorProducer) this.l, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
