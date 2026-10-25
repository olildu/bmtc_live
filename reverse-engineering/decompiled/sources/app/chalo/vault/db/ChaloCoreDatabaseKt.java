package app.chalo.vault.db;

import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCoreDatabaseKt {
    public static final Object a(CoroutineContextProvider coroutineContextProvider, Function1 function1, Continuation continuation) {
        return BuildersKt.g(coroutineContextProvider.b(), new ChaloCoreDatabaseKt$runOnIo$2(function1, null), continuation);
    }
}
