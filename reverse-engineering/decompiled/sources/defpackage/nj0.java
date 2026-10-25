package defpackage;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class nj0 {
    public static boolean a(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, Function2 function2) {
        return function2.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, Function2 function2) {
        return function2.invoke(element, obj);
    }
}
