package app.chalo.compose.utils;

import androidx.compose.ui.focus.FocusRequester;
import app.chalo.utils.FocusRequester_androidKt;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/utils/SafeFocusRequester;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeFocusRequester {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1928a;
    public boolean b;
    public final ContextScope c;
    public final FocusRequester d;

    public SafeFocusRequester() {
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        this.c = CoroutineScopeKt.a(MainDispatcherLoader.f17879a);
        this.d = new FocusRequester();
    }

    public final void a() {
        if (this.f1928a) {
            FocusRequester_androidKt.a(this.d, this.c);
        } else {
            this.b = true;
        }
    }
}
