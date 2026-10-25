package app.chalo.tito.data.repository.dao;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/data/repository/dao/TITOValidationDao;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TITOValidationDao {
    Object a(String str, TitoValidationStatus titoValidationStatus, ContinuationImpl continuationImpl);

    FlowQuery$mapToOneOrNull$$inlined$map$1 b(String str);

    FlowQuery$mapToList$$inlined$map$1 c(String str);

    Object d(TITOValidationEntity tITOValidationEntity, ContinuationImpl continuationImpl);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 e();

    FlowQuery$mapToList$$inlined$map$1 f(String str);
}
