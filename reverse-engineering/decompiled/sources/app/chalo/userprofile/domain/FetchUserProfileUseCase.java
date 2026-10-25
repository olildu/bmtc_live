package app.chalo.userprofile.domain;

import app.chalo.login.data.exceptions.ProfileAndTokensExceptions;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.data.exceptions.FetchUserProfileFailedException;
import app.chalo.userprofile.data.repository.UserProfileRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/FetchUserProfileUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchUserProfileUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f10323a;
    public final UserProfileRepository b;

    public FetchUserProfileUseCase(UserProfileDetailsProvider userProfileDetailsProvider, UserProfileRepository userProfileRepository) {
        this.f10323a = userProfileDetailsProvider;
        this.b = userProfileRepository;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, InvalidProfileDetails -> 0x00e5, NetworkSuccessResponseParseException -> 0x00ed, ChaloLocalException -> 0x00f5, TryCatch #2 {InvalidProfileDetails -> 0x00e5, ChaloLocalException -> 0x00f5, NetworkSuccessResponseParseException -> 0x00ed, FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, blocks: (B:15:0x0034, B:57:0x00cf, B:22:0x0048, B:48:0x00b6, B:50:0x00ba, B:53:0x00c3, B:59:0x00d5, B:23:0x004d, B:40:0x008e, B:42:0x00a0, B:44:0x00a8, B:37:0x0085), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[Catch: FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, InvalidProfileDetails -> 0x00e5, NetworkSuccessResponseParseException -> 0x00ed, ChaloLocalException -> 0x00f5, TryCatch #2 {InvalidProfileDetails -> 0x00e5, ChaloLocalException -> 0x00f5, NetworkSuccessResponseParseException -> 0x00ed, FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, blocks: (B:15:0x0034, B:57:0x00cf, B:22:0x0048, B:48:0x00b6, B:50:0x00ba, B:53:0x00c3, B:59:0x00d5, B:23:0x004d, B:40:0x008e, B:42:0x00a0, B:44:0x00a8, B:37:0x0085), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba A[Catch: FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, InvalidProfileDetails -> 0x00e5, NetworkSuccessResponseParseException -> 0x00ed, ChaloLocalException -> 0x00f5, TryCatch #2 {InvalidProfileDetails -> 0x00e5, ChaloLocalException -> 0x00f5, NetworkSuccessResponseParseException -> 0x00ed, FetchUserProfileFailedException -> 0x0039, Exception -> 0x00dd, blocks: (B:15:0x0034, B:57:0x00cf, B:22:0x0048, B:48:0x00b6, B:50:0x00ba, B:53:0x00c3, B:59:0x00d5, B:23:0x004d, B:40:0x008e, B:42:0x00a0, B:44:0x00a8, B:37:0x0085), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchUserProfileUseCase$invoke$1 fetchUserProfileUseCase$invoke$1;
        FetchUserProfileResult fetchUserProfileResult;
        UserProfileAppModel userProfileAppModel;
        Object objK;
        UserProfileAppModel userProfileAppModel2;
        String str;
        UserProfileAppModel userProfileAppModel3;
        if (continuationImpl instanceof FetchUserProfileUseCase$invoke$1) {
            fetchUserProfileUseCase$invoke$1 = (FetchUserProfileUseCase$invoke$1) continuationImpl;
            int i = fetchUserProfileUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchUserProfileUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchUserProfileUseCase$invoke$1 = new FetchUserProfileUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchUserProfileUseCase$invoke$1 = new FetchUserProfileUseCase$invoke$1(this, continuationImpl);
        }
        Object objK2 = fetchUserProfileUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchUserProfileUseCase$invoke$1.label;
        UserProfileRepository userProfileRepository = this.b;
        UserProfileDetailsProvider userProfileDetailsProvider = this.f10323a;
        try {
            if (i2 == 0) {
                ResultKt.b(objK2);
                if (!((Boolean) userProfileDetailsProvider.g().getValue()).booleanValue()) {
                    return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                }
                fetchUserProfileUseCase$invoke$1.label = 1;
                objK2 = userProfileDetailsProvider.k(fetchUserProfileUseCase$invoke$1);
                if (objK2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                ResultKt.b(objK2);
            } else {
                if (i2 == 2) {
                    ResultKt.b(objK2);
                    userProfileAppModel = (UserProfileAppModel) objK2;
                    if (!((Boolean) userProfileDetailsProvider.g().getValue()).booleanValue()) {
                        return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                    }
                    fetchUserProfileUseCase$invoke$1.L$0 = userProfileAppModel;
                    fetchUserProfileUseCase$invoke$1.label = 3;
                    objK = userProfileDetailsProvider.k(fetchUserProfileUseCase$invoke$1);
                    if (objK == coroutineSingletons) {
                        userProfileAppModel2 = userProfileAppModel;
                        objK2 = objK;
                        str = (String) objK2;
                        if (str != null) {
                            fetchUserProfileUseCase$invoke$1.L$0 = userProfileAppModel2;
                            fetchUserProfileUseCase$invoke$1.label = 4;
                            if (userProfileRepository.c(userProfileAppModel2, fetchUserProfileUseCase$invoke$1) != coroutineSingletons) {
                                userProfileAppModel3 = userProfileAppModel2;
                            }
                        }
                        return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    userProfileAppModel2 = (UserProfileAppModel) fetchUserProfileUseCase$invoke$1.L$0;
                    ResultKt.b(objK2);
                    str = (String) objK2;
                    if (str != null && str.equals(userProfileAppModel2.i)) {
                        fetchUserProfileUseCase$invoke$1.L$0 = userProfileAppModel2;
                        fetchUserProfileUseCase$invoke$1.label = 4;
                        if (userProfileRepository.c(userProfileAppModel2, fetchUserProfileUseCase$invoke$1) != coroutineSingletons) {
                            userProfileAppModel3 = userProfileAppModel2;
                        }
                        return coroutineSingletons;
                    }
                    return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                userProfileAppModel3 = (UserProfileAppModel) fetchUserProfileUseCase$invoke$1.L$0;
                ResultKt.b(objK2);
            }
            return new ChaloUseCaseResult.Success(userProfileAppModel3);
            String str2 = (String) objK2;
            if (str2 == null) {
                return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
            }
            fetchUserProfileUseCase$invoke$1.label = 2;
            objK2 = userProfileRepository.a(str2, fetchUserProfileUseCase$invoke$1);
            if (objK2 != coroutineSingletons) {
                userProfileAppModel = (UserProfileAppModel) objK2;
                if (!((Boolean) userProfileDetailsProvider.g().getValue()).booleanValue()) {
                    return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                }
                fetchUserProfileUseCase$invoke$1.L$0 = userProfileAppModel;
                fetchUserProfileUseCase$invoke$1.label = 3;
                objK = userProfileDetailsProvider.k(fetchUserProfileUseCase$invoke$1);
                if (objK == coroutineSingletons) {
                    userProfileAppModel2 = userProfileAppModel;
                    objK2 = objK;
                    str = (String) objK2;
                    if (str != null) {
                        fetchUserProfileUseCase$invoke$1.L$0 = userProfileAppModel2;
                        fetchUserProfileUseCase$invoke$1.label = 4;
                        if (userProfileRepository.c(userProfileAppModel2, fetchUserProfileUseCase$invoke$1) != coroutineSingletons) {
                            userProfileAppModel3 = userProfileAppModel2;
                            return new ChaloUseCaseResult.Success(userProfileAppModel3);
                        }
                    }
                    return new ChaloUseCaseResult.Failure(FetchUserProfileResult.USER_NOT_LOGGED_IN);
                }
            }
            return coroutineSingletons;
        } catch (ProfileAndTokensExceptions.InvalidProfileDetails unused) {
            return new ChaloUseCaseResult.Failure(FetchUserProfileResult.INVALID_RESPONSE);
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(FetchUserProfileResult.UNKNOWN_LOCAL_EXCEPTION);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(FetchUserProfileResult.RESPONSE_PARSE_EXCEPTION);
        } catch (FetchUserProfileFailedException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            if (num != null && num.intValue() == 3000) {
                fetchUserProfileResult = FetchUserProfileResult.USER_DOES_NOT_EXIST;
            } else {
                fetchUserProfileResult = (num != null && num.intValue() == 3105) ? FetchUserProfileResult.USER_ID_MISMATCH : FetchUserProfileResult.SERVER_ERROR;
            }
            return new ChaloUseCaseResult.Failure(fetchUserProfileResult);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(FetchUserProfileResult.UNKNOWN);
        }
    }
}
