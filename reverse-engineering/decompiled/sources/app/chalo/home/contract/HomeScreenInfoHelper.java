package app.chalo.home.contract;

import app.chalo.home.SnackBarData;
import app.chalo.home.ui.base.CommonBottomSheetType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/contract/HomeScreenInfoHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HomeScreenInfoHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(SnackBarData snackBarData);

    StateFlow b();

    void c(boolean z);

    void d(boolean z);

    void e();

    StateFlow f();

    String g();

    void h(ContextScope contextScope);

    StateFlow i();

    void j();

    StateFlow k();

    void l(String str);

    void m();

    Object n(int i, CommonBottomSheetType commonBottomSheetType, ContinuationImpl continuationImpl);

    Object o(Continuation continuation);

    boolean p();

    void q();

    void r();

    Object s(CommonBottomSheetType commonBottomSheetType, SuspendLambda suspendLambda);

    StateFlow t();

    String u();
}
