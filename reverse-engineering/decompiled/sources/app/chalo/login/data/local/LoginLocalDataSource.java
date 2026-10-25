package app.chalo.login.data.local;

import app.chalo.userprofile.UserProfileLocalInfoModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/local/LoginLocalDataSource;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LoginLocalDataSource {
    Object a(boolean z, ContinuationImpl continuationImpl);

    Object b(ContinuationImpl continuationImpl);

    Object c(Continuation continuation);

    Object d(ContinuationImpl continuationImpl);

    Object f(long j, String str, Continuation continuation);

    Object g(ContinuationImpl continuationImpl);

    Object h(UserProfileLocalInfoModel userProfileLocalInfoModel, Continuation continuation);

    Object i(String str, String str2, Long l, Long l2, Continuation continuation);
}
