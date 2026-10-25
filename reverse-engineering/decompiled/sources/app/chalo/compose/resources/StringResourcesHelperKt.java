package app.chalo.compose.resources;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import app.chalo.providers.stringprovider.StringArrayEnum;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "str", "", "strArray", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringResourcesHelperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f1912a = CompositionLocalKt.staticCompositionLocalOf(new a());

    public static final String a(StringEnum stringEnum, List list) {
        Intrinsics.i(stringEnum, "stringEnum");
        return (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new StringResourcesHelperKt$getString$1(stringEnum, list, null));
    }

    public static final List b(StringArrayEnum stringArrayEnum, Composer composer) {
        Intrinsics.i(stringArrayEnum, "stringArrayEnum");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122523310, 6, -1, "app.chalo.compose.resources.stringArrayResource (StringResourcesHelper.kt:40)");
        }
        StringProvider stringProvider = (StringProvider) composer.consume(f1912a);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyList.f17557a, null, 2, null);
            BuildersKt.d(coroutineScope, null, CoroutineStart.UNDISPATCHED, new StringResourcesHelperKt$stringArrayResource$strArray$2$1(mutableStateMutableStateOf$default, stringProvider, stringArrayEnum, null), 1);
            composer.updateRememberedValue(mutableStateMutableStateOf$default);
            obj = mutableStateMutableStateOf$default;
        }
        List list = (List) ((MutableState) obj).getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String c(StringEnum stringEnum, Object[] objArr, Composer composer, int i) {
        Object obj;
        Intrinsics.i(stringEnum, "stringEnum");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(632742676, i, -1, "app.chalo.compose.resources.stringResource (StringResourcesHelper.kt:25)");
        }
        StringProvider stringProvider = (StringProvider) composer.consume(f1912a);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(stringEnum.ordinal())) || (i & 6) == 4) | composer.changed(objArr);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            obj = objRememberedValue2;
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            BuildersKt.d(coroutineScope, null, CoroutineStart.UNDISPATCHED, new StringResourcesHelperKt$stringResource$str$2$1(mutableStateMutableStateOf$default, stringProvider, stringEnum, objArr, null), 1);
            composer.updateRememberedValue(mutableStateMutableStateOf$default);
            obj = mutableStateMutableStateOf$default;
        }
        obj = objRememberedValue2;
        String str = (String) ((MutableState) obj).getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
