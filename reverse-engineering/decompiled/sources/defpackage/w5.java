package defpackage;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w5 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19893a;
    public final /* synthetic */ LocaleList b;

    public /* synthetic */ w5(int i, LocaleList localeList) {
        this.f19893a = i;
        this.b = localeList;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19893a;
        String str = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return AnnotatedStringKt.decapitalize$lambda$0(this.b, str, iIntValue, iIntValue2);
            case 1:
                return AnnotatedStringKt.capitalize$lambda$0(this.b, str, iIntValue, iIntValue2);
            case 2:
                return AnnotatedStringKt.toUpperCase$lambda$0(this.b, str, iIntValue, iIntValue2);
            default:
                return AnnotatedStringKt.toLowerCase$lambda$0(this.b, str, iIntValue, iIntValue2);
        }
    }
}
