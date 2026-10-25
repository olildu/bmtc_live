package app.chalo.userprofile.domain;

import app.chalo.extensions.KotlinDateTimeExtensionsKt;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.data.repository.UserProfileRepository;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/UpdateUserProfileUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateUserProfileUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f10327a;
    public final UserProfileRepository b;
    public final TimeUtilsContract c;
    public final SystemHelper d;

    public UpdateUserProfileUseCase(UserProfileDetailsProvider userProfileDetailsProvider, UserProfileRepository userProfileRepository, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper) {
        this.f10327a = userProfileDetailsProvider;
        this.b = userProfileRepository;
        this.c = timeUtilsContract;
        this.d = systemHelper;
    }

    public final int a(int i) {
        return KotlinDateTimeExtensionsKt.b(LocalDateTime.INSTANCE, this.d.j(), this.c.b()).o() - i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r3.c(r0, r12) == r2) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(java.lang.String r17, java.lang.String r18, java.lang.String r19, app.chalo.userprofile.Gender r20, java.lang.Long r21, java.lang.String r22, java.lang.Integer r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.domain.UpdateUserProfileUseCase.b(java.lang.String, java.lang.String, java.lang.String, app.chalo.userprofile.Gender, java.lang.Long, java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }
}
