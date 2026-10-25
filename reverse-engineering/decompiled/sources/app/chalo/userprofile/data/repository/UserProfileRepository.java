package app.chalo.userprofile.data.repository;

import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/data/repository/UserProfileRepository;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserProfileRepository {
    Object a(String str, ContinuationImpl continuationImpl);

    Object b(String str, String str2, String str3, String str4, String str5, Long l, String str6, Integer num, ContinuationImpl continuationImpl);

    Object c(UserProfileAppModel userProfileAppModel, ContinuationImpl continuationImpl);

    Object d(Continuation continuation);
}
