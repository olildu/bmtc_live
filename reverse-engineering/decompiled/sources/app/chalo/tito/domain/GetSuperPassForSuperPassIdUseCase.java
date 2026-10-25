package app.chalo.tito.domain;

import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GetSuperPassForSuperPassIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetSuperPassForSuperPassIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f9662a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9663a;

        static {
            int[] iArr = new int[SuperPassSubType.values().length];
            try {
                iArr[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9663a = iArr;
        }
    }

    public GetSuperPassForSuperPassIdUseCase(SuperPassRepository superPassRepository) {
        this.f9662a = superPassRepository;
    }

    public final Object a(String passId, SuperPassSubType superPassSubType, ContinuationImpl continuationImpl) {
        SuperPassDao superPassDao = this.f9662a.b;
        int i = WhenMappings.f9663a[superPassSubType.ordinal()];
        if (i == 1) {
            Intrinsics.i(passId, "passId");
            Object objV = FlowKt.v(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(superPassDao.I(passId)), continuationImpl);
            return objV == CoroutineSingletons.COROUTINE_SUSPENDED ? objV : (SuperPass) objV;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.i(passId, "passId");
        Object objV2 = FlowKt.v(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(superPassDao.D(passId)), continuationImpl);
        return objV2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objV2 : (SuperPass) objV2;
    }
}
