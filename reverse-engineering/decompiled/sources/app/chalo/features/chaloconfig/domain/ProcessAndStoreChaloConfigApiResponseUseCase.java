package app.chalo.features.chaloconfig.domain;

import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/domain/ProcessAndStoreChaloConfigApiResponseUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessAndStoreChaloConfigApiResponseUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigRepository f2651a;
    public final LanguageFeature b;

    public ProcessAndStoreChaloConfigApiResponseUseCase(ChaloConfigRepository chaloConfigRepository, GetChaloConfigDataKeyForLanguageUseCase getChaloConfigDataKeyForLanguageUseCase, LanguageFeature languageFeature) {
        this.f2651a = chaloConfigRepository;
        this.b = languageFeature;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014b -> B:41:0x0114). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x014f -> B:41:0x0114). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x016b -> B:58:0x016c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.features.chaloconfig.data.model.ChaloConfigApiResponseModel r8, java.lang.String r9, long r10, app.chalo.features.language.data.Language r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.domain.ProcessAndStoreChaloConfigApiResponseUseCase.a(app.chalo.features.chaloconfig.data.model.ChaloConfigApiResponseModel, java.lang.String, long, app.chalo.features.language.data.Language, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Set set, Language language, ContinuationImpl continuationImpl) {
        ProcessAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1 processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1;
        if (continuationImpl instanceof ProcessAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1) {
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1 = (ProcessAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1) continuationImpl;
            int i = processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.label = i - Integer.MIN_VALUE;
            } else {
                processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1 = new ProcessAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1(this, continuationImpl);
            }
        } else {
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1 = new ProcessAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1(this, continuationImpl);
        }
        Object objN = processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.label;
        Unit unit = Unit.f17538a;
        ChaloConfigRepository chaloConfigRepository = this.f2651a;
        if (i2 == 0) {
            ResultKt.b(objN);
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$0 = set;
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$1 = language;
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.label = 1;
            objN = chaloConfigRepository.n(processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1);
            if (objN != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
            return unit;
        }
        language = (Language) processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$1;
        set = (Set) processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$0;
        ResultKt.b(objN);
        List list = (List) objN;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!set.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$0 = null;
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.L$1 = null;
            processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1.label = 2;
            if (chaloConfigRepository.i(arrayList, language, processAndStoreChaloConfigApiResponseUseCase$purgeOldCachedData$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
