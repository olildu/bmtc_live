package app.chalo.productsummary.domain;

import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productsummary/domain/CheckAndFetchPassDataFromPassIdUseCase;", "", "PassDataFetchFailed", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckAndFetchPassDataFromPassIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8714a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productsummary/domain/CheckAndFetchPassDataFromPassIdUseCase$PassDataFetchFailed;", "", "<init>", "(Ljava/lang/String;I)V", "PASS_NOT_FOUND", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum PassDataFetchFailed {
        PASS_NOT_FOUND;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<PassDataFetchFailed> getEntries() {
            return $ENTRIES;
        }
    }

    public CheckAndFetchPassDataFromPassIdUseCase(SuperPassRepository superPassRepository) {
        this.f8714a = superPassRepository;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$invoke$1 r0 = (app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$invoke$1 r0 = new app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.superpass.data.repository.SuperPassRepository r3 = r6.f8714a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r8)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r8)
            goto L4a
        L3c:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r3.n(r7, r0)
            if (r8 != r1) goto L4a
            goto L59
        L4a:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
            if (r8 != 0) goto L5c
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r8 = r3.m(r7, r0)
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
        L5c:
            if (r8 != 0) goto L66
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase$PassDataFetchFailed r8 = app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase.PassDataFetchFailed.PASS_NOT_FOUND
            r7.<init>(r8)
            return r7
        L66:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.domain.CheckAndFetchPassDataFromPassIdUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
